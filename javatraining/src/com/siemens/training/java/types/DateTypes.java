package com.siemens.training.java.types;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTypes {

    public static void main(final String[] args) {
        //old
        Date dateLoc = new Date();
        GregorianCalendar calendarLoc = new GregorianCalendar();
        calendarLoc.add(Calendar.DAY_OF_MONTH,
                        1);
        Date timeLoc = calendarLoc.getTime();

        SimpleDateFormat dateFormatLoc = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormatLoc.format(dateLoc);

        // new
        LocalDate localDateLoc = LocalDate.now();
        LocalDate plusDaysLoc = localDateLoc.plusDays(15);
        LocalDate newLocalDateLoc = LocalDate.of(1988,
                                                 1,
                                                 23);

        LocalDateTime localDateTimeLoc = LocalDateTime.now();
        LocalDateTime localDateTimeLoc2 = LocalDateTime.of(2021,
                                                           11,
                                                           20,
                                                           10,
                                                           19);
        LocalDateTime plusHoursLoc = localDateTimeLoc.plusMonths(3)
                                                     .minusDays(6)
                                                     .plusHours(5)
                                                     .plusMinutes(3)
                                                     .minusSeconds(40);
        ZonedDateTime zonedDateTimeLoc = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        Instant instantLoc = zonedDateTimeLoc.toInstant();

        LocalTime localTime = LocalTime.now();

        Duration durationLoc = Duration.between(localDateTimeLoc2,
                                                localDateTimeLoc);
        durationLoc.getSeconds();

        Period periodLoc = Period.ofMonths(10);
        int daysLoc = periodLoc.getDays();
        DateTimeFormatter ofPatternLoc = DateTimeFormatter.ofPattern("HH,mm:ss---yyyy=MM/dd ZZZZ");
        String formatLoc = localDateTimeLoc.atZone(ZoneId.systemDefault())
                                           .format(ofPatternLoc);
        System.out.println(formatLoc);
    }

}
