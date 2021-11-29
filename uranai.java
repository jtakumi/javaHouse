public class uranai {
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
    System.out.println ( age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
    System.out.println("1: 大吉☆　2: 中吉　3:吉　4:凶　5:もうだめだ・・・オシマイダ(;ω;)");
 }
}