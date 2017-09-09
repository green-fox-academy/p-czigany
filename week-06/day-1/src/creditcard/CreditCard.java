package creditcard;

import java.util.Random;

public class CreditCard implements CreditCardy {

  private int sumCVV;
  private String nameCardholder;
  private String codeAccount;
  private static int count = 0;

  CreditCard() {
    this.nameCardholder = "ABC" + count;
    this.codeAccount = randomize16Digits();
    this.sumCVV = cumeSumCVV(this.codeAccount);
    count++;
  }

  String randomize16Digits() {
    StringBuilder random16Digits = new StringBuilder();
    Random rnd = new Random();
    for (int i = 0; i < 16; i++) {
      random16Digits.append(rnd.nextInt(10));
    }
    return random16Digits.toString();
  }

  @Override
  public int getSumCVV() {
    return sumCVV;
  }

  @Override
  public String getNameCardholder() {
    return nameCardholder;
  }

  @Override
  public String getCodeAccount() {
    return codeAccount;
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    int sum = 0;
    for (char digit : codeAccount.toCharArray()) {
      sum += Character.getNumericValue(digit);
    }
    return sum;
  }

  @Override
  public String toString() {
    return "Name=" + nameCardholder + " CC#=" + codeAccount + " CVV=" + sumCVV;
  }
}
