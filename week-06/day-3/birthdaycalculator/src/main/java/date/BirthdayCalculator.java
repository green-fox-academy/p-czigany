package date;

/**
 * Created by peter on 2017.04.20..
 */
public interface BirthdayCalculator<T> {

  T parseDate(String str);

  String printMonthAndDay(T date);
}
