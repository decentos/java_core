package JavaCore.Enum;

public enum DayOfWeek {
    MONDAY("40"), TUESDAY("32"), WEDNESDAY("24"), THURSDAY("16"), FRIDAY("8"),
    SATURDAY("Выходной"), SUNDAY("Выходной");

    DayOfWeek(String hour) {
        this.hour = hour;
    }

    private String hour;

    public String getHour() {
        return hour;
    }
}
