package cond;

public class If6 {

  public static void main(String[] args) {
    int price = 10000;
    int age = 10;
    int discount = 0;

    if(price >= 10000){
      discount += price / 10;
      System.out.println("10,000원 이상 10% 할인 (-"+price/10+"원)");
    } else if(age <= 10){
      discount += 1000;
      System.out.println("10세 이하 1,000원 할인 (-1,000원)");
    } else {
      System.out.println("할인 없음");
    }
    System.out.println("총 할인 금액: "+discount+"원");
  }
}
