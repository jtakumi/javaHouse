import java.util.Scanner;

public class mondai {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;
    System.out.println("問１　日本一高い山は？\n1.阿蘇山　2.剣山　3.富士山");
    x = sc.nextInt();
    if(x == 3) {
     System.out.println("正解");
     }else {
     System.out.println("不正解");
     }
    sc.close();
    }
  }
     