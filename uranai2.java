public class uranai2 {
  public static void main(String[] args) {
    System.out.println("ようこそ。占いの館へ");
    System.out.println("あなたのお名前は？");
    String name = new java.util.Scanner (
     System.in ).nextLine ( );
    System.out.println("あなたのご年齢は？");
    String ageString = new java.util.Scanner (
     System.in ).nextLine ( );
    int age = Integer.parseInt ( ageString );
    int fortune = new java.util.Random ( ).nextInt ( 4 );
    fortune++;
    System.out.println ("結果が出ました");
    if(fortune == 1) {
    System.out.println ( age + "歳の" + name + "さん、あなたの運気は大吉です");
  }
    if(fortune == 2){
    System.out.println ( age + "歳の" + name + "さん、あなたの運気は中吉です");
    }
    if(fortune == 3){
    System.out.println ( age + "歳の" + name + "さん、あなたの運気は吉です");
    }
    if(fortune ==4){
    System.out.println ( age + "歳の" + name + "さん、あなたの運気は凶です");
    }
    if(fortune ==5){
    System.out.println ( age + "歳の" + name + "さん、あなたの運気は大変なことになっているようです。\n神社でお祓いをうけてください");
 }
 System.out.println ( "ご利用ありがとうございました。");
   }
}