import java.util.Scanner;

public class volleyball {
   private String[] team = {"", "�X", "���", "�{��", "�H�c", "�R�`", "����"};
   private int[] point = {0, 0, 0, 0, 0, 0, 0};
   public void input() {
   int kachi, make, scount;
   Scanner sc = new Scanner(System.in);
   System.out.println("�����`�[���̔ԍ�����͂��Ă�������");
   System.out.println("�ԍ���1=�X,2=���,3=�{��,4=�H�c,5=�R�`,6=����");
   kachi = sc.nextInt();
   while(kachi != 0) {
   System.out.println("�����`�[���̔ԍ�����͂��Ă�������");
   make  = sc.nextInt();
   System.out.println("�����`�[���̃Z�b�g������͂��Ă�������");
   scount = sc.nextInt();
   System.out.printf("%s 3-%d %s\n" , team[kachi], scount, team[make]);
   if(scount == 2) {
      point[kachi] = point[kachi] + 2;
      point[make] = point[make] + 1;
      } else {
      point[kachi] = point[kachi] + 3;
      }
      System.out.println();
      System.out.println("�����`�[���̔ԍ�����͂��Ă�������");
      System.out.println("�ԍ���1=�X,2=���,3=�{��,4=�H�c,5=�R�`,6=����");
      kachi = sc.nextInt();
     }
     sc.close();
     }
     
     public void output() {
       System.out.println("�y�����_�\�z");
       for(int i = 1; i <= 6; i++) {
       System.out.printf("%s\t%d\n", team[i], point[i]);
       }
       
      }
      public static void main(String[] args) {
      volleyball vb = new volleyball();
      vb.input();
      vb.output();
      }
      
    }
       