class TestClass {
 public String name = "ƒAƒŒ";
 
 public String testMethod() {
 return "‚È‚ñ‚¾‚Á‚¯";
 }
}
  

public class arenan {
  public static void main(String[] args) {
   TestClass c = new TestClass();
   String str1 = c.name;
   String str2 = c.testMethod();
    System.out.println(str1 + str2);
   }
 }