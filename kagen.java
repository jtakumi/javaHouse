import java.util.Scanner;
public class kagen {
  public static void main(String args[]) {
   int x1 = 0;
   int x2 = 0;
   int wa = 0;
   int sa = 0;
   int sw = 1;
   Scanner scan = new Scanner(System.in);
   System.out.println("�n�߂�@1�ȏ�̐����@�I��0�ȉ��̐���(���ׂĔ��p��)");
   sw = scan.nextInt();
   while(sw > 0){
   System.out.println("�v�Z���������l2����͂��Ă�������");
   System.out.println("1��");
   x1 = scan.nextInt();
   System.out.println("2��");
   x2 = scan.nextInt();
   wa = x1 + x2;
   if(x1 > x2){
   sa = x1 - x2;
   }else{
   sa = x2 - x1;
   }
   System.out.println();
   System.out.println("�a" + wa);
   System.out.println("��" + sa + "�ƂȂ�܂����B" + "\n���̂܂ܑ����܂����H" + "\n������ꍇ��1�ȏ�@�����łȂ��ꍇ��0�ȉ�");
   sw = scan.nextInt();
   }
   System.out.print("�����p���肪�Ƃ��������܂����B");
   }
}