package com.ua.rush.module1.lesson27;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("change");
//        Date d1 = new Date();
//        System.out.println(d1);
//        System.out.println(d1.getTime());
//
//        System.out.println(d1.getDate());
//        System.out.println(d1.getMonth());
//        System.out.println(d1.getYear());
//
//        d1.setMonth(11);
//        System.out.println(d1);
//        d1.set
//        Date d2 = new Date();
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d1.after(d2));
//        System.out.println(d1.getTimezoneOffset());

//        Date d3 = new

//        LocalDate d4 = LocalDate.now();
//        System.out.println(d4);
//        LocalTime t1 = LocalTime.now();
//        System.out.println(t1);
//        LocalDateTime dt1 = LocalDateTime.now();
//        System.out.println(dt1);
//        System.out.println(d4.getDayOfMonth());
//        System.out.println(d4.getDayOfWeek());
//        System.out.println(d4.getDayOfYear());
//        System.out.println(d4.atTime(LocalTime.now()));
//
//        System.out.println(LocalDate.of(2029, 12, 31));
//        System.out.println(LocalDate.ofYearDay(2029, 201));
//        System.out.println(LocalDate.ofEpochDay(2056));
//        System.out.println();
//        System.out.println(d4.plusDays(1));
//        System.out.println(d4.plusMonths(1));
//        System.out.println(d4.plusWeeks(7));
//        System.out.println(d4.plusYears(3));
//        System.out.println();
//        System.out.println(LocalDate.of(2025, 1, 31).plusMonths(1));

        LocalDate d1 = LocalDate.now();
      //  System.out.println(d1);
        int day = d1.getDayOfMonth();
        int month = d1.getMonthValue();
        int year = d1.getYear();
//        System.out.println(day + "/" + month + "/" + year);

//        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM.yyyy");
//        var result = d1.format(sdf);
//        System.out.println(result);
//        System.out.println();
//        LocalTime t1 = LocalTime.now();
//        System.out.println(t1);
//        DateTimeFormatter tdf = DateTimeFormatter.ofPattern("HH:mm");
//        var result2 = t1.format(tdf);
//        System.out.println(result2);
//        System.out.println();
//        var dt1 = LocalDateTime.now();
//        System.out.println(dt1);
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
//        var result3 = dt1.format(dtf);
//        System.out.println(result3);

//        System.out.println();
//        var dateTime = LocalDateTime.parse("2025-09-29T20:13:38");
//        System.out.println(dateTime);
//        String dateTimeString = "2025/09/29 12:01";
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
//        var dateTime2 = LocalDateTime.parse(dateTimeString, dtf);
//        System.out.println(dateTime2);

//        ThaiBuddhistDate buddhist =
//                ThaiBuddhistDate.from(LocalDate.now());
//        System.out.println("Thai Buddhist date: " + buddhist);
//        System.out.println(calendar);
//        System.out.println(Calendar.getInstance());

//        Instant instant = Instant.now();
//        System.out.println(instant);
////        System.out.println(instant.getEpochSecond());
////        System.out.println(instant.getNano());
//        ZonedDateTime zdt = ZonedDateTime.now();
//        System.out.println(zdt);
////        System.out.println(zdt.getZone());
////        System.out.println(zdt.getOffset());
//
//        ZonedDateTime zdt2 = instant.atZone(ZoneId.of("CST6CDT"));
//        System.out.println(zdt2);

//        System.out.println(ZoneId.getAvailableZoneIds());

        Instant i1 = Instant.now();
        System.out.println(i1);
        Thread.sleep(1000);
        Instant i2 = Instant.now();
        System.out.println(i2);
        Duration duration = Duration.between(i1, i2);
        System.out.println(duration.toMillis());
        var d2 = Duration.between(LocalTime.now(), LocalTime.now().plusHours(12));
        System.out.println(d2.toMinutes());



    }
}
