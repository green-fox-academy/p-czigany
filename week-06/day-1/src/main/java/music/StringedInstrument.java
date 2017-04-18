package main.java.music;

/**
 * Created by peter on 2017.04.18..
 */
public abstract class StringedInstrument extends Instrument {

  int numberOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }
}
