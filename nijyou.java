import java.util.Scanner;

public class nijyou {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x;
    System.out.println("二乗したい数を入力してください(0を入力で終了)");
    x = sc.nextInt();
    while(x != 0) {
      System.out.println( x + "の二乗は" + (x * x));
       System.out.println("二乗したい数を入力してください(0を入力で終了)");
       x = sc.nextInt();
     }
     sc.close();
  }
}