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

  @Override
  public boolean isAnniversaryToday(LocalDate date) {
    // TODO - return with true if today is the same month+day as date
    return (LocalDate.now().getMonth().equals(date.getMonth())
            && LocalDate.now().getDayOfMonth() == date.getDayOfMonth());
  }

  @Override
  public int calculateAgeInYears(LocalDate birthday) {
    // TODO - return how many years age the input date 'birthday' was
    return LocalDate.now().getYear() - birthday.getYear();
  }

  @Override
  public int calculateDaysToNextAnniversary(LocalDate date) {
    // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
    while (date.isBefore(LocalDate.now())) {
      date = LocalDate.of(date.getYear() + 1, date.getMonth(), date.getDayOfMonth());
    }
    int days = 0;
    LocalDate now = LocalDate.now();
    while (!date.equals(now)) {
      now = now.plusDays(1);
      days++;
    }
    return days;
  }

  public static void main(String[] args) {
    new BirthdayWithLocalDate().run();
  }

  private void run() {

    print("Birthday with java.util.Date.");
    String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

    LocalDate birthdayDate = parseDate(birthdayStr);
    print("Your birthday: " + printMonthAndDay(birthdayDate));

    if (isAnniversaryToday(birthdayDate)) {
      int ageInYears = calculateAgeInYears(birthdayDate);
      print("Congratulations! Today is your " + ageInYears + "th birthday!");
    } else {
      int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
      print("You have to wait only " + daysLeft + " days for your next birthday.");
    }
  }

  private void print(String line) {
    System.out.println(line);
  }

  private String readInput(String message) {
    System.out.print(message + ": ");
    return input.nextLine();
  }

  private final Scanner input = new Scanner(System.in, "UTF-8");
}
