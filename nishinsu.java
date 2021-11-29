public class nishinsu {
  public int[] atai10;
  public int[] hosu2 = new int[8];
  public int[] hosuT = new int[8];
  int i, n;
  public nishinsu(int atai10) {
     this.atai10 = atai10;
     }
     public void henkan10to2() {
     n = atai10;
     for(i = 7;i >= 0; i--) {
     atai2[i] = n % 2;
     n = n / 2;
     }
     System.out.print("2進数　：");
     for(i = 0; i <= 7; i++) {
     System.out.print(atai[i]);
     }
     System.out.println();
     }
     public void henkan2toHosu() {
     for(i = 0; i <= 7; i++) {
     hosuT[i] = 1 - hosu2[i];
     }
     i = 7;
     while(hosuT[i] == 1) {
     hosuT[i] = 0;
     hosuT[i] -= 1;
     }
     hosuT[i] = 1;
     System.out.print("2の補数");
     for(i = 0; i <= 7; i++) {
        System.out.print(hosuT[i]);
     }
     System.out.println();
     }
    }
    
    import java.util.Scanner;
    
    public class Hosu {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("10進数を入力してください");
    int atai = sc.nextInt();
    Henkan hk = new Henkan(atai);
    hk.henkan10to2();
    hk.henkan2toHosu();
    }
}