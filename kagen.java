import java.util.Scanner;
public class kagen {
  public static void main(String args[]) {
   int x1 = 0;
   int x2 = 0;
   int wa = 0;
   int sa = 0;
   int sw = 1;
   Scanner scan = new Scanner(System.in);
   System.out.println("始める　1以上の数字　終了0以下の数字(すべて半角で)");
   sw = scan.nextInt();
   while(sw > 0){
   System.out.println("計算したい数値2つを入力してください");
   System.out.println("1つ目");
   x1 = scan.nextInt();
   System.out.println("2つ目");
   x2 = scan.nextInt();
   wa = x1 + x2;
   if(x1 > x2){
   sa = x1 - x2;
   }else{
   sa = x2 - x1;
   }
   System.out.println();
   System.out.println("和" + wa);
   System.out.println("差" + sa + "となりました。" + "\nこのまま続けますか？" + "\n続ける場合は1以上　そうでない場合は0以下");
   sw = scan.nextInt();
   }
   System.out.print("ご利用ありがとうございました。");
   }
}
