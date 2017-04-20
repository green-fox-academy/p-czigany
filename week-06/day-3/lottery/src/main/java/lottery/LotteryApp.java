package lottery;

import java.util.List;

/**
 * Created by peter on 2017.04.20..
 */
public class LotteryApp {

  public static void main(String[] args) {
    String sourcePath = "assets/otos.csv";
    CsvFileHandler csvFiles = new CsvFileHandler();
    List<String[]> tableLines = csvFiles.getTableLines(sourcePath);
    List<String[]> linesToPrint = tableLines;
    String targetPath = "assets/output.csv";
    csvFiles.writeTableLines(targetPath, linesToPrint);
  }
}
