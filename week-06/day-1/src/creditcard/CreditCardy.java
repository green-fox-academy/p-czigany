package creditcard;

/**
 * Created by peter on 2017.04.18..
 */
public interface CreditCardy {

  int getSumCVV();

  String getNameCardholder();

  String getCodeAccount();

  int cumeSumCVV(String codeAccount); // computes codeAccount checksum

  String toString (); //String.format("Name=%s CC#=%s CVV=%d");
}
