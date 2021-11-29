//ç°Ç‹Ç≈îÉÇ¡ÇΩìØêléè
public class Item {
    public String name;
    public int price;
    public int kin;
    public void print() {
       System.out.print(name + "(" + price + "â~)");
       }
      }
       
       
    public class FanBook extends Item {
      private String author;
      public FanBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
        }
      public void print() {
        System.out.print(name + "(" + price + "â~)");
        System.out.println("çÏé“ " + author):
        kin = kin + price;
        }
      }
      public class Syoyu {
        Item hon[] = new Item[];
      public Syoyu(Item h1, Item h2, Item h3, Item h4, Item h5, Item h6, Item h7, Item h8, Item h9) {
         hon[0] = h1;
         hon[1] = h2;
         hon[2] = h3;
         hon[3] = h4;
         hon[4] = h5;
         hon[5] = h6;
         hon[6] = h7;
         hon[7] = h8;
         hon[8] = h9;
         }