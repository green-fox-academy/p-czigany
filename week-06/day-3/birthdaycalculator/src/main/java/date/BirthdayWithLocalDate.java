package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by peter on 2017.04.20..
 */
public class BirthdayWithLocalDate implements BirthdayCalculator<LocalDate> {

  @Override
  public LocalDate parseDate(String str) {
    // TODO - return with the parsed date; format is: yyyy-MM-dd
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return LocalDate.parse(str, formatter);
  }

  @Override
  public String printMonthAndDay(LocalDate date) {
    // TODO - return the date formatted: month & day (MM. dd.)
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM. dd.");
    return date.format(formatter);
  }
}
