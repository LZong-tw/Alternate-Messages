/**
 * Name: Yun-Chung Lin
 * ID: U1010425
 * Ex: Alternate Two Messages
 * Information: 
 *      
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Alternate extends JFrame {
  static boolean boo=true;    //Save to judge the phase whether it's "Fun" or "Powerful"
  public Alternate() {
    Panel p = new Panel();
    add(p);
    addMouseListener(new MouseListener() {
        @Override /** Handle mouse-Clicked event */
        public void mouseClicked(MouseEvent e) {
          boo=boo==true?false:true;  //Change the phase.
          repaint();
        }

        @Override /** Handle mouse-Exited event */
        public void mouseExited(MouseEvent e) {
        }

        @Override /** Handle mouse-Pressed event */
        public void mousePressed(MouseEvent e) {
        }

        @Override /** Handle mouse-Released event */
        public void mouseReleased(MouseEvent e) {
        }

        @Override /** Handle mouse-Entered event */
        public void mouseEntered(MouseEvent e) {
        }
      });
  }

  public static void main(String[] args) {
    Alternate frame = new Alternate();
    frame.setTitle("Alternate");
    frame.setSize(200, 100);
    frame.setLocationRelativeTo(null); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  static class Panel extends JPanel {
    private String message1="Java is fun.", message2="Java is powerful.";
    private int x=20, y=20;
    /** Construct a panel to draw string */
    public Panel() {
      
    }

    @Override
    protected void paintComponent(Graphics g) {
      if(boo){
        super.paintComponent(g);
        g.drawString(message1, x, y);      
      }
      else{
        super.paintComponent(g);
        g.drawString(message2, x, y);      
      }
    }
  }
}
