class dentaku2{
 public static void main(String args[]){
   int val1 =0; /* �ŏ��̕��� */
   int val2 =0; /* ���̕��� */
   String ope;  /* ���Z�q */
   
   if (args.length != 3){
     System.out.println("Usage : java dentaku ���l ���Z�q ���l");
     System.out.println("���Z�q�� kake waru tasu hiku �̂S�ł�");
     System.exit(0); /* �v���O�������I������ */
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
       System.out.println("���Z�q�� kake waru tasu hiku �̂S�ł�");
       System.exit(0); /* �v���O�������I������ */
      }
      
      System.out.println("���͂��ꂽ���� " + val1 + " " + ope + " " + val2 + "�ł�");
    }
  }