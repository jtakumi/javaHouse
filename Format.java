import java.util.Date;
import java.text.DateFormat;

public class Format {

   public static void main(String[] ages) {
     Date now = new Date();
     Format fmt = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.LONG);
     System.out.print("“ú–{‘®(full, Long)= " + fmt.format(now));
   }

}