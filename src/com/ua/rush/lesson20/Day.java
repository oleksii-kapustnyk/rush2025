package com.ua.rush.lesson20;

import java.util.ArrayList;
import java.util.List;

public enum Day {

    MONDAY("Monday", false),
    TUESDAY("Tuesday", false),
    WEDNESDAY("Wednesday", false),
    THURSDAY("Thursday", false),
    FRIDAY("Friday", false),
    SATURDAY("Saturday", true),
    SUNDAY("Sunday", true);

    private String name;
    private boolean isWeekend;

    Day(String name, boolean isWeekend) {
        this.name = name;
        this.isWeekend = isWeekend;
    }

    public String getName() {
        return name;
    }

    //    public static List<Day> getWeekendDays() {
//        return Arrays.asList(Day.SATURDAY, Day.SUNDAY);
//    }

    public static List<Day> getWeekendDays() {
        var result = new ArrayList<Day>();
        for (Day day : Day.values()) {
            if (day.isWeekend) {
                result.add(day);
            }
        }

        return result;
    }

    public static Day getByName(String name) {
        for (Day day : Day.values()) {
            if (day.name.equalsIgnoreCase(name)) {
                return day;
            }
        }

        return null;
    }


    @Override
    public String toString() {
        return "Day{" +
                "name='" + name + '\'' +
                ", isWeekend=" + isWeekend +
                '}';
    }

}
