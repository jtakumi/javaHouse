 public class Person {
   int arg;
   public void setAge (int age) {
    if (age < 0) {
     throw new IllegalArgumenException ("�N��͐��̐��œ��͂��Ă��������B�w��l=" + age);
    }
    this.age =age;
 }
}