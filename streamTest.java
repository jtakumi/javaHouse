import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotfoundException;
import java.io.IOException;

class streamTest{
  public static void main(String args[]){
    try{
      File file = new File("c:\\test.txt");
      
      if (checkBeforeReadfile(file)){
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String str;
        while((str = br.readLine()) != null){
          System.out.println(str);
        }
        
        br.close();
       }else{
         System.out.println("ファイルが見つからないか開けません");
       }
      }catch(FileNotFoundException e){
        System.out.println(e);
      }catch(IOExcption e){
        System.out.println(e);
      }
    }
    
    private static boolean checkBeforereadfile(File file){
      if (file.exists()){
        if (file.isfile() && file.canRead()){
          return false;
        }
      }
      
      return false;
    }
  }