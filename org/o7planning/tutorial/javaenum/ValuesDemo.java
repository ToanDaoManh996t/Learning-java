package org.o7planning.tutorial.javaenum;

public class ValuesDemo {
    public static void main(String[] args) {
        WeekDay[] allDays = WeekDay.values();
        for (WeekDay day : allDays) {
            System.out.println("Day: " + day);
        }
    }
}
