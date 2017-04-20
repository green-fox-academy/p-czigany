package lottery;

import java.util.ArrayList;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

/**
 * Created by peter on 2017.04.20..
 */
public class LotteryApp {

  public static void main(String[] args) {
    OptionParser parser = new OptionParser();
    parser.accepts("f").withRequiredArg();
    parser.accepts("y").withRequiredArg();
    parser.accepts("o").withRequiredArg();
    OptionSet options = parser.parse(args);
    String sourcePath = "assets/otos.csv";
    if (options.has("f")) {
      sourcePath = options.valueOf("f").toString();
    }
    CsvFileHandler csvFiles = new CsvFileHandler();
    List<String[]> tableLines = csvFiles.getTableLines(sourcePath);
    List<String[]> linesToPrint = new ArrayList<>();
    if (options.has("y")) {
      String year = options.valueOf("y").toString();
      for (String[] line :
              tableLines) {
        if (line[0].equals(year)) {
          linesToPrint.add(line);
        }
      }
    } else {
      linesToPrint = tableLines;
    }
    String targetPath = "assets/output.csv";
    if (options.has("o")) {
      targetPath = options.valueOf("o").toString();
    }
    csvFiles.writeTableLines(targetPath, linesToPrint);
  }
}
