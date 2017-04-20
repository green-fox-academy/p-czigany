package date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import static org.junit.Assert.assertEquals;

/**
 * Created by peter on 2017.04.20..
 */
public class TestBirthdayWithLocalDate {

  private static final String EXPECTED_DATE_STR = "2016-11-30";
  private static final LocalDate EXPECTED_DATE = LocalDate
          .parse(EXPECTED_DATE_STR, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

  private BirthdayCalculator<LocalDate> birthdayCalculator = new BirthdayWithLocalDate();

  @Test
  public void testParseDate() throws Exception {
    assertEquals(EXPECTED_DATE, birthdayCalculator.parseDate(EXPECTED_DATE_STR));
  }

  @Test(expected = DateTimeParseException.class)
  public void testParseDateNonDate() throws Exception {
    birthdayCalculator.parseDate("nonDate");
  }

  @Test(expected = NullPointerException.class)
  public void testParseDateWithNull() throws Exception {
    birthdayCalculator.parseDate(null);
  }

  @Test
  public void testPrintMonthAndDay() throws Exception {
    String monthAndDay = birthdayCalculator.printMonthAndDay(EXPECTED_DATE);
    assertEquals("11. 30.", monthAndDay);
  }

  @Test(expected = NullPointerException.class)
  public void testPrintMonthAndDayWithNull() throws Exception {
    birthdayCalculator.printMonthAndDay(null);
  }

  @Test
  public void testIsAnniversaryToday() throws Exception {
    String pattern = "MM. dd.";
    boolean expected = EXPECTED_DATE.toString().equals(LocalDate.now().toString());
    assertEquals(expected, birthdayCalculator.isAnniversaryToday(EXPECTED_DATE));
  }

  @Test(expected = NullPointerException.class)
  public void testIsAnniversaryTodayWithNull() throws Exception {
    birthdayCalculator.isAnniversaryToday(null);
  }
}
