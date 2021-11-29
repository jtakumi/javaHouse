import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class JSample1 extends JFrame {
  public static void main(String arg[]) {
    JSample1 frame = new JSample1("MyTitle");
    frame.setVisible(true);
    }
    
   JSample1(String title) {
   setTitle(title);
   setBounds(100,100,600,400);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   JRadioButton radio1 = new JRadioButton("Apple");
   JRadioButton radio2 = new JRadioButton("piapple");
   
   JPanel p = new JPanel();
   p.add(radio1);
   p.add(radio2);
   
   Container contentPane = getContentPane();
   contentPane.add(p, BorderLayout.CENTER);
   }
 }