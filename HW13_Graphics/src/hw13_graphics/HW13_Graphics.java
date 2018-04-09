
package hw13_graphics;
//B10509040_郭宜萱
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random random = new Random();
        for(int i =0;i<10;i++){
            g.drawRect(random.nextInt(200)+1, random.nextInt(200)+1, random.nextInt(200)+1, random.nextInt(200)+1);
        }
    }
  }  
public class HW13_Graphics {

    public static void main(String[] args) {
        JFrame frame = new JFrame("隨機產生10個矩形");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MyPanel());
        frame.setVisible(true);      
    }
    
}
