package org.o7planning.tutorial.javaenum;

public class Timetable {
    public static String getJob(WeekDay weekDay) {
        if (weekDay == WeekDay.SATURDAY || weekDay == WeekDay.SUNDAY) {
            return "Weekend";
        }
        return "Normal";
    }
}
