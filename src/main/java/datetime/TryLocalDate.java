package datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TryLocalDate {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println("today is " + today);
//    today = today.plusDays(3);
//    today = today.plus(3, ChronoUnit.DAYS);
    LocalDate weekend = today.plus(3, ChronoUnit.DAYS);
    System.out.println("today is " + today);
    System.out.println("weekend is " + weekend);
    DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MMMM-yyyyyy 'at sometime' ");
    System.out.println("weekend is " + form.format(weekend));

    Period weird = Period.of(1, 18, 465);
    System.out.println("period is " + weird);
    Period sensible  = weird.normalized();
    System.out.println("period is " + sensible);

    /*
    A) P2Y6M465D
    B) P1Y18M465D
    C) P3Y6M100D
    D) Throw an exception
     */
  }
}
