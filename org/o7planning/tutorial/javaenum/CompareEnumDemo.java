package org.o7planning.tutorial.javaenum;

public class CompareEnumDemo {
    public static void main(String[] args) {
        WeekDay today = WeekDay.SUNDAY;
        if (today == WeekDay.SUNDAY) {
            System.out.println("Today is Sunday");
        }
    }
}
