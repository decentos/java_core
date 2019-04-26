package JavaCore.Marathon;


import JavaCore.Marathon.Obstacle.*;
import JavaCore.Marathon.Participants.*;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Wall(3), new Cross(350), new Water(4));

        Team team1 = new Team("Team One", new Human("Олег"), new Cat("Пушок"),
                new Dog("Рекс"), new Cat("Шарик"));

        Team team2 = new Team("Team Two", new Human("Петр"), new Cat("Желток"),
                new Dog("Бродяга"), new Dog("Лохматый"));


        c.doIt(team1);
        c.doIt(team2);

        System.out.println("\n===== Результаты =====\n");
        team1.showResults();
        System.out.println();
        team2.showResults();

        System.out.println();
        team1.positiveInfo();
        System.out.println();
        team2.positiveInfo();
    }
}