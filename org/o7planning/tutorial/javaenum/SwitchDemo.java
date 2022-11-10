package org.o7planning.tutorial.javaenum;

public class SwitchDemo {
    public static void main(String[] args) {
        WeekDay day = WeekDay.TUESDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Working day");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println(day);
        }
    }
}
