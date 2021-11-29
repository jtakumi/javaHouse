import java.util.Scanner;

public class nijyou {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x;
    System.out.println("“ñæ‚µ‚½‚¢”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢(0‚ğ“ü—Í‚ÅI—¹)");
    x = sc.nextInt();
    while(x != 0) {
      System.out.println( x + "‚Ì“ñæ‚Í" + (x * x));
       System.out.println("“ñæ‚µ‚½‚¢”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢(0‚ğ“ü—Í‚ÅI—¹)");
       x = sc.nextInt();
     }
     sc.close();
  }
}