package lottery;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by peter on 2017.04.20..
 */
public class CsvFileHandler {

  public CsvFileHandler() {
  }

  public List<String[]> getTableLines(String fileName) {
    try {
      CSVReader reader = new CSVReader(new FileReader(fileName), ';');
      return reader.readAll();
    } catch (IOException e) {
      System.out.println("I/O Exception occurred.");
      return null;
    }
  }

  public void writeTableLines(String fileName, List<String[]> lines) {
    try {
      CSVWriter writer = new CSVWriter(new FileWriter(fileName), ';',
              CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(lines);
      writer.close();
    } catch (IOException e) {
      System.out.println("I/O Exception occurred.");
    }
  }
}
