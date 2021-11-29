import java.io.File;

class fileTest{
  public static void main(String aegs[]){
    File cdirectory = new File("c:\\");
    
    String filelist[] = cdirectory.list();
    for (int i = 0 ; i < filelist.length ; i++){
      System.out.println(filelist[i]);
     }
   }
 }