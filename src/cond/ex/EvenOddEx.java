package cond.ex;

public class EvenOddEx {

  public static void main(String[] args) {
    int x = 14;
    String x_type = (x % 2) == 0 ? "짝수" : "홀수";
    System.out.println("x는 " + x_type + " 입니다.");
  }
}
