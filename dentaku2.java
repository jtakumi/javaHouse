class dentaku2{
 public static void main(String args[]){
   int val1 =0; /* 最初の文字 */
   int val2 =0; /* 次の文字 */
   String ope;  /* 演算子 */
   
   if (args.length != 3){
     System.out.println("Usage : java dentaku 数値 演算子 数値");
     System.out.println("演算子は kake waru tasu hiku の４つです");
     System.exit(0); /* プログラムを終了する */
    }
    
    val1 = Integer.parseInt(args[0]);
    val2 = Integer.parseInt(args[2]);
    ope =args[1];
    
    String opeStr[] = {"kake","waru","tasu","hiku"};
    boolean errflag = true;
    
    for (int i = 0 ; i <4 ; i++){
      if (ope.equals(opeStr[i])){
        errflag =false;
       }
     }
     
     if (errflag == true){
       System.out.println("演算子は kake waru tasu hiku の４つです");
       System.exit(0); /* プログラムを終了する */
      }
      
      System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + "です");
    }
  }