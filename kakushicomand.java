import java.util.Scanner;
class kakushicomand{
    public static void main(String args[]){
       System.out.println("特定の願いをかなえるかもしれない ひらがなでお願いします");
       Scanner scan = new Scanner(System.in);
       String str = scan.next();
       while(str != "しゅうりょう"){
       switch(str){
       case "やらないか":
       System.out.println("そんなにお望みなら・・・");
       System.out.println("やらないか♂");
       break;
       case "きゅうどう":
       System.out.println("弓矢を手に入れた");
       break;
       case "つよくなる":
       System.out.println("力が20上がった");
       break;
       case "まんじ":
       System.out.println("マジ卍");
       break;
       case "あいたい":
       System.out.println("このプログラムを遊んでくれてありがとう\n作者より");
       break;
       case "やじゅう":
       System.out.println("野獣が現れた。その性格は獰猛だ。");
       break;
       case "ゆめのくに":
       System.out.println("ゆめのくにのチケットを手に入れた");
       break;
       case "つかれた":
       System.out.println("お疲れ様です");
       break;
       case "やまのてせん":
        System.out.println("大崎　五反田　目黒　恵比寿　渋谷　原宿　代々木　新宿　新大久保　高田馬場　目黒　池袋　大塚　巣鴨　駒込　田端　西日暮里　日暮里　
        case "青鬼":
        System.out.println("ブルーベリー色の全裸の巨人があなたを貪り食った");
        break;
       default:
       System.out.println("すみません。その願いはかなえることができません。");
       System.out.println("もう一度打ち込んでください");
       }
       System.out.println("願い事をひらがなでどうぞ");
       str = scan.next();
      } 
     }
     System.out.println("またどうぞ");
}