import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class MainTest {

  @ParameterizedTest()
  @Test
  @CsvFileSource(resources = "numerals.csv")
  void romanToInteger(String numeral, int expectedValue) {
    assertEquals(expectedValue, Main.romanToInteger(numeral));
  }
}