 /*
  * To change this template, choose Tools | Templates
  * and open the template in the editor.
  */
 package mp5package;
 
 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.Rectangle;
 import javax.swing.JComponent;
 
 /**
  *
  * @author wayne
  */
 public class RectangleComponent extends JComponent {
    public void paintComponent( Graphics g ) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
       
        // Construct a rectangle and draw it
        Rectangle box = new Rectangle( 5, 96, 4, 4 );
        g2.draw( box );
        
        g2.clearRect(5, 96 , 2, 2);
        
        // Move rectangle 15 pixels to the right and 25 pixels down
        box.translate( 0, -25 );
        
        // Draw moved rectangle
        g2.draw( box );
    }
 }
