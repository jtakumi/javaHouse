import java.io.File;

class javafile{
  public static void main(String args[]){
    File cdirectory = new File("D:java\\");
    
    File filelist[] = cdirectory.listFiles();
    for (int i = 0 ; i < filelist.length ; i++){
      if (filelist[i].isFile()){
        System.out.println("[File]" + filelist[i].getName());
       }else if (filelist[i].isDirectory()){
         System.out.println("[Directory]" + filelist[i].getName());
       }else{
         System.out.println("[?]" + filelist[i].getName());
       }
     }
   }
 }