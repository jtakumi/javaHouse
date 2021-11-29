import java.util.Scanner;

public class volleyball {
   private String[] team = {"", "青森", "岩手", "宮城", "秋田", "山形", "福島"};
   private int[] point = {0, 0, 0, 0, 0, 0, 0};
   public void input() {
   int kachi, make, scount;
   Scanner sc = new Scanner(System.in);
   System.out.println("勝ちチームの番号を入力してください");
   System.out.println("番号→1=青森,2=岩手,3=宮城,4=秋田,5=山形,6=福島");
   kachi = sc.nextInt();
   while(kachi != 0) {
   System.out.println("負けチームの番号を入力してください");
   make  = sc.nextInt();
   System.out.println("負けチームのセット数を入力してください");
   scount = sc.nextInt();
   System.out.printf("%s 3-%d %s\n" , team[kachi], scount, team[make]);
   if(scount == 2) {
      point[kachi] = point[kachi] + 2;
      point[make] = point[make] + 1;
      } else {
      point[kachi] = point[kachi] + 3;
      }
      System.out.println();
      System.out.println("勝ちチームの番号を入力してください");
      System.out.println("番号→1=青森,2=岩手,3=宮城,4=秋田,5=山形,6=福島");
      kachi = sc.nextInt();
     }
     sc.close();
     }
     
     public void output() {
       System.out.println("【勝ち点表】");
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
       