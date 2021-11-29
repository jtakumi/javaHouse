import java.awt.FlowLayout;
import javax.swing.*;
public class Main {
 public static void main (String[] age) {
  JFrame frame = new JFrame ("GUIで一言");
  JLabel label = new JLabel ("押すなよ！絶対に押すなよ！！");
  JButton button = new JButton ("ヤル気スイッチ");
  frame.getContenPane ( ).setLayout (new FlowLayout ( ) );
  frame.getContenPane ( ).add ( label );
  frame.getContenPane ( ).add ( button );
  frame.setDefaultCloeOperation ( JFrame.EXIT_ON_CLOSE );
  frame.setSize ( 350,150);
  frame.setVisible (true);
 }
}