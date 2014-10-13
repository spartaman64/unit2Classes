import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.Color;


/**
 * Creates a setting or background for the objects to be in.
 * 
 * @author (John Li) 
 * @version (1.0)
 */
public class Background 
{
     private int xLeft;
     private int yTop;
     /**
      * constructor for background
      * parameters sets the location of the background
      */
     public Background(int x, int y)
     {
         xLeft = x;
         yTop = y;
         
        }
        
     /**
      * draws the background with sky and land and sets its size
      * parameters calls the graphics2d method g2 in cityscapecomponent
      */
     public void draw(Graphics2D g2)
     {
         Rectangle2D.Double back
         = new Rectangle2D.Double (xLeft + 0, yTop + 0,800,600);
         
         Rectangle2D.Double backGround
         = new Rectangle2D.Double (xLeft + 0, yTop + 550,800,200);
         
         g2.draw(back);
         g2.setColor(Color.BLUE);
         g2.fill(back);
         
         g2.draw(backGround);
         g2.setColor(Color.GREEN);
         g2.fill(backGround);
        }

}
