public class s {
  public static void main(String[] args) {
    int i = args.length;
    if(i == 0) System.out.println("引数は０個です");
    else if(i % 2 == 0)
      System.out.println("引数の数は偶数です");
    else
      System.out.println("引数の数は奇数です");
 }
}