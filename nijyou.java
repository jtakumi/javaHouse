import java.util.Scanner;

public class nijyou {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x;
    System.out.println("��悵����������͂��Ă�������(0����͂ŏI��)");
    x = sc.nextInt();
    while(x != 0) {
      System.out.println( x + "�̓���" + (x * x));
       System.out.println("��悵����������͂��Ă�������(0����͂ŏI��)");
       x = sc.nextInt();
     }
     sc.close();
  }
}