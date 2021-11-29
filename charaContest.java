public class Shukei {
   public String name;
   public int[] ninzu = new int[5];
   public Shukei(String name) {
     this.name = name;
     }
     public void input(int sei, int shu) {
     int i = sei + shu * 2;
     ninzu[i]++;
     ninzu[4]++;
     }
     
  public void output(){
     System.out.print(name);
     for(int i = 0; i < 5; i++) {
     System.out.printf(" %,8d",ninzu[i]);
     }
     System.out.println();
     
     }
}
   
   
    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;
    
    
     public class charaContest {
       public static void main(String[] args) throws IOException {
       String[] charaName = {"投票合計", "チャチャ", "ナッツ", "マイマイ", "マチャミ", "マッキー", "ワッキー"};
       Shukei[] sh = new Shukei[7];
       for(int m = 0; m <= 6; i++) {
         sh[m] = new Shukei(charaName[m]);
         }
         BufferedReader fileIn = new BufferedReader(new FileReader("kekka.csv"));
         String line;
         while((line = fileIn.readLine()) != null) {
           String str[] = line.suput(",");
           int sei = Integer.parseInt(str[0]);
           int shu = Integer.parseInt(str[1]);
           int ban = Integer.parseInt(str[2]);
           sh[ban].input(sei, shu);
           sh[0].input(sei, shu);
           }
           fileIn.close();
           System.out.println("キャラクター人気投票結果");
           System.out.println("キャラクター名　　小人男子　小人女子　成人男子　成人女子　合計");
           for(i = 1; i < 7; i++) {
           sh[i].output();
           }
           sh[0].output();
           }
  }