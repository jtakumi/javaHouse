import java.awt.FlowLayout;
import javax.swing.*;
public class Main {
 public static void main (String[] age) {
  JFrame frame = new JFrame ("GUI�ňꌾ");
  JLabel label = new JLabel ("�����Ȃ�I��΂ɉ����Ȃ�I�I");
  JButton button = new JButton ("�����C�X�C�b�`");
  frame.getContenPane ( ).setLayout (new FlowLayout ( ) );
  frame.getContenPane ( ).add ( label );
  frame.getContenPane ( ).add ( button );
  frame.setDefaultCloeOperation ( JFrame.EXIT_ON_CLOSE );
  frame.setSize ( 350,150);
  frame.setVisible (true);
 }
}