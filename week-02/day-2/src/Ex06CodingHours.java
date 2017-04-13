/**
 * Created by peter on 2017.03.21..
 */
public class Ex06CodingHours {

  public static void main(String[] args) {
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    int dailyHours = 6;
    int semLength = 17;
    int workdaysPerWeek = 5;
    int averageWorkHoursPerWeek = 52;
    float ratio;
    ratio = (dailyHours * workdaysPerWeek / (float)averageWorkHoursPerWeek) * 100;
    System.out.println(dailyHours * semLength * workdaysPerWeek + " hours of coding total.");
    System.out.println(ratio + "% of total working hours.");
  }
}
