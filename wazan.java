import java.util.Scanner;

public class wazan {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("1からいくつまでの数の和を求める？入力→"); 
      int x = sc.nextInt();
      int wa = 0;
      for (int i = 1; i <= x; i++) {
          wa = wa + i;
          System.out.println(i + " " + wa);
      }
      System.out.println("1から" + x + "までの和は" + wa + "だぞ☆");
    }

}