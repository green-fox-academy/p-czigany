package main.java.music;

/**
 * Created by peter on 2017.04.18..
 */
public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    name = "Electric Guitar";
    numberOfStrings = 6;
    sound = "Twang";
  }

  public ElectricGuitar(int strings) {
    name = "Electric Guitar";
    numberOfStrings = strings;
    sound = "Twang";
  }
}
