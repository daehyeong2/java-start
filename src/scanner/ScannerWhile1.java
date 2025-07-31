package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while(true) {
      String s = scanner.nextLine();
      if(s.equals("exit")) break;
      System.out.println(s);
    }
  }
}
