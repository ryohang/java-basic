package io.ascending.training.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

        LocalDateTime ldtparse = LocalDateTime.parse("2019-06-22T23:29:58.309");
        System.out.println(ldtparse);
    }
}
