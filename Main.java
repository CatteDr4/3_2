import java.util.Scanner;

public class Main {

  static String odwrocWielkosc(String ciag) {
    var result = new StringBuilder();

    for(int i = 0; i< ciag.length(); i++) {
      char c_char = ciag.charAt(i);
      if(Character.isLowerCase(c_char)) {
        result.append(Character.toUpperCase(c_char));
      }
      else {
        result.append(Character.toLowerCase(c_char));
      }
    }

    return result.toString();
  }

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    System.out.println("Podaj liczbe do silni: ");
    String tekst = scanner.nextLine();

    String wynik = odwrocWielkosc(tekst);

    System.out.println(wynik);
  }
}