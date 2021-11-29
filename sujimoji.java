import java.util.Scanner;

public class sujimoji {

   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int s;
   int cnt = 1;
    System.out.println("数字を入力してください");
   s = sc.nextInt();
   while(s != 7387) {
   cnt = cnt + 1;
   System.out.println("もう一度やり直してください");
   s = sc.nextInt();
   }
   if(cnt == 1) {
   System.out.println("き、君はエスパーか！？");
   }else if(cnt <= 3){
   System.out.println("よくやった！");
   }else{
   System.out.println("お疲れさま");
   }
   
  }

}
   