package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Vector;

public class ClientHandler {
    private DataInputStream in;
    private DataOutputStream out;
    private Socket socket;
    private MainServer server;
    private String nick;
    private String clientName;

    private static int counter = 0;

    public ClientHandler(Socket socket, MainServer server) {
        try {
            counter++;
            this.clientName = "user" + counter;
            this.socket = socket;
            this.server = server;
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            // IDEA подсказала, что можно записать все через лямбду
            new Thread(() -> {
                    try {
                        // цикл для авторизации
                        while (true) {
                            String str = in.readUTF();
                            // если сообщение начинается с /auth
                            if(str.startsWith("/auth")) {
                                String[] tokens = str.split(" ");
                                // Вытаскиваем данные из БД
                                String newNick = AuthService.getNickByLoginAndPass(tokens[1], tokens[2]);

                                // Проверка дублей // НЕ РАБОТАЕТ
                                if (server.repeatLogin(tokens[1])){
                                    System.out.println("Пользователь уже авторизован!");
                                }

                                if (newNick != null) {
                                    // отправляем сообщение об успешной авторизации
                                    sendMsg("/authok");
                                    nick = newNick;
                                    server.subscribe(ClientHandler.this);
                                    break;
                                } else {
                                    sendMsg("Неверный логин/пароль!");
                                }
                            }
                        }

                        // блок для отправки сообщений
                        while (true) {
                            String str = in.readUTF();
                            if(str.equals("/end")) {
                                out.writeUTF("/serverClosed");
                                break;
                            }

                            // Личные сообщения:
                            if(str.startsWith("/w")) {
                                String to = str.split(" ")[1];
                                //String msg = str.split(" ")[2]; // так отправляется только первое слово
                                server.wisperMsg(this, to, str); // сообщение выбранным

                                // если использовать str вместо msg в третьем аргументе, то отправляется все сообщение
                                // но при этом служебная команда "/w user2" тоже является частью сообщения

                            } else {
                                server.broadcastMsg("[" + this.clientName + "] " + str); //сообщение для всех
                            }
                            out.flush();
                        }
                    }  catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        server.unsubscribe(ClientHandler.this);
                    }
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(String msg) {
        try {
            out.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getClientName() {
        return this.clientName;
    }
}
