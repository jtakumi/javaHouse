 public class Person {
   int arg;
   public void setAge (int age) {
    if (age < 0) {
     throw new IllegalArgumenException ("年齢は正の数で入力してください。指定値=" + age);
    }
    this.age =age;
 }
}