package HomeWork4;
import javax.swing.*;
import java.awt.*;
public class Q7 {
       public void paintComponent(Graphics g){
            Rectangle r=new Rectangle(100,100,100,100);
            Graphics2D g2=(Graphics2D) g;
            g2.setColor(Color.pink);
            g2.fill(r);
            Rectangle c=new Rectangle(50,50,100,100);
            Graphics2D g1=(Graphics2D) g;
            g1.setColor(Color.magenta);
            g1.fill(c);

        }
}
