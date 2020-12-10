import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

  }

  private static Map<Character, Integer> romanMap = new HashMap<>() {{

    put('I', 1);
    put('V', 5);
    put('X', 10);
    put('L', 50);
    put('C', 100);
    put('D', 500);
    put('M', 1000);
    put('i', 1);
    put('v', 5);
    put('x', 10);
    put('l', 50);
    put('c', 100);
    put('d', 500);
    put('m', 1000);

  }};

  public static int romanToInteger(String roman) {

    int number = 0;

    for (int i = 0 ; i < roman.length(); i ++) {
      if (i + 1 < roman.length() && romanMap.get(roman.charAt(i)) < romanMap.get(roman.charAt(i + 1))) {
        number = number - romanMap.get(roman.charAt(i));
      }
      else {
      number += romanMap.get(roman.charAt(i));
      }
    }
    return number;
  }

}
