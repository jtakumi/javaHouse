class TestClass {
 public String name = "アレ";
 
 public String testMethod() {
 return "なんだっけ";
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