import java.util.Scanner;

public class wazan {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("1���炢���܂ł̐��̘a�����߂�H���́�"); 
      int x = sc.nextInt();
      int wa = 0;
      for (int i = 1; i <= x; i++) {
          wa = wa + i;
          System.out.println(i + " " + wa);
      }
      System.out.println("1����" + x + "�܂ł̘a��" + wa + "������");
    }

}