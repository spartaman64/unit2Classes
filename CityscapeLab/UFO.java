import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Creates a UFO in the sky.
 * 
 * @author (John Li) 
 * @version (1.0)
 */
public class UFO 
{
  private int xLeft;
  private int yTop;
  /**
   * constructor for UFO
   * parameters sets x and y coordnates of where the UFO is located
   */
   public UFO(int x, int y)
   {
       xLeft = x;
       yTop = y;
    }
    
    /**
     * drawing the ufo and its window 
     * parameters calls the graphics2d method g2 in cityscapecomponent
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double UFO
        = new Ellipse2D.Double(xLeft + 400, yTop + 100,200,100);
        Ellipse2D.Double ufoWindow
        = new Ellipse2D.Double(xLeft + 410, yTop + 110, 150,50);
        
        g2.draw(UFO);
        g2.setColor(Color.WHITE);
        g2.fill(UFO);
        
        g2.draw(ufoWindow);
        g2.setColor(Color.YELLOW);
        g2.fill(ufoWindow);
    }   

}
