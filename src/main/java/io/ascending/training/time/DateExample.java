package io.ascending.training.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
    public static void main(String[] args){
        Date oldToday = new Date();
//        Date oldOther = new Date(oldToday.getTime());
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt1 = ldt.plusDays(5);
        System.out.println(oldToday);
        System.out.println(ldt);
        System.out.println(ldt1);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

//        LocalDateTime.of(10,5,5,30,0,0);
        LocalDateTime ldtparse = LocalDateTime.parse("2019-06-22T23:29:58.309");
        System.out.println(ldtparse);

        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

//        Date d = new Date();
//        new Date(d.getTime()+1000*60*60*24);
//        d.getTime();

//        System.out.println(LocalDate.now().plusDays(1).plusMonths(1));
//        System.out.println(LocalDateTime.now());

//        System.out.println(ZonedDateTime.now());
//        ZonedDateTime dc = ZonedDateTime.now();
//        System.out.println(dc);
//        ZoneId swissZone = ZoneId.of("Europe/Zurich");
//        ZonedDateTime swissZoned = dc.withZoneSameInstant(swissZone);
//        LocalDateTime swissLocal = swissZoned.toLocalDateTime();
//        System.out.println(swissZoned);
//        System.out.println(swissLocal);
    }
}
