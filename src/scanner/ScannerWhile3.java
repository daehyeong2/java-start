package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    while(true){
      int n = scanner.nextInt();
      if(n == 0) {
        System.out.println("총합: " + sum);
        break;
      }
      sum += n;
    }
  }
}
