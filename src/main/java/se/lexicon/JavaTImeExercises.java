package se.lexicon;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class JavaTImeExercises {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        String custom = currentDate.format(DateTimeFormatter.ofPattern("eeee dd MMM"));
        System.out.println(custom);


        LocalDate lastMonday = currentDate.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        for (LocalDate date = lastMonday; date.isBefore(lastMonday.plusDays(7));
             date = date.plusDays(1)) {
            System.out.println(date.format(DateTimeFormatter.ISO_DATE));
        }

        String dateString = "2016-08-14";
        LocalDate date1 = LocalDate.parse(dateString);
        System.out.println("Bangkok 2016 " + date1);

        LocalDate myBirthday = LocalDate.parse("2002-05-10");
        String dayOfBirthday = myBirthday.format(DateTimeFormatter.ofPattern(" ->" + " eeee"));
        System.out.println(myBirthday + dayOfBirthday);

        LocalDate currentDate1 = LocalDate.now();
        LocalDate newDate1 = currentDate1.plusYears(10).minusMonths(10);
        System.out.println(newDate1.format(DateTimeFormatter.ofPattern("MMM")));

        Period period = Period.between(myBirthday, newDate1);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println(years + " years, " + months + " months, " + days + " days, ");

        Period period1 = Period.of(4, 7, 29);
        LocalDate currentDate2 = currentDate1.plus(period1);
        System.out.println(currentDate2);

    }
}
