import java.util.Scanner;

public class sujimoji {

   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int s;
   int cnt = 1;
    System.out.println("��������͂��Ă�������");
   s = sc.nextInt();
   while(s != 7387) {
   cnt = cnt + 1;
   System.out.println("������x��蒼���Ă�������");
   s = sc.nextInt();
   }
   if(cnt == 1) {
   System.out.println("���A�N�̓G�X�p�[���I�H");
   }else if(cnt <= 3){
   System.out.println("�悭������I");
   }else{
   System.out.println("����ꂳ��");
   }
   
  }

}
   