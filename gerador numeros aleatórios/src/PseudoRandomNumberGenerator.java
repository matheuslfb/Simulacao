import java.time.LocalDateTime;
import java.util.Objects;

public class PseudoRandomNumberGenerator {

  static Double seed;
  final static int CONSTANTE = 4;

  public static Double generateRandomNumber(Double a, Double maxValue) {
    if (seed == null) {
      seed = (double) LocalDateTime.now().getSecond();
    }
    seed = (a * seed + CONSTANTE ) % maxValue;
    return seed / maxValue;
  }

}