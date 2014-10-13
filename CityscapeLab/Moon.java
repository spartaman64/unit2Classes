import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Creates a moon in the blue skype with a face.
 * 
 * @author (John Li) 
 * @version (1.0)
 */
public class Moon 
{
    private int xLeft;
    private int yTop;
   /** 
    * constructor for moon
    * The x and y coordnates for where the moon is located
    */
   public Moon(int x, int y)
   {
       xLeft = x;
       yTop = y;
    }
    
    /**
     * drawing the moon and its craters with size and location
     * parameters calls the graphics2d method g2 in cityscapecomponent
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon
        = new Ellipse2D.Double(xLeft + 0, yTop + 0,200,200);
        
        Ellipse2D.Double moonCraterLeft
        = new Ellipse2D.Double(xLeft + 50, yTop + 50,50,50);
        
        Ellipse2D.Double moonCraterRight
        = new Ellipse2D.Double(xLeft + 100, yTop + 50,50,50);
        
        Ellipse2D.Double moonCraterCenter
        = new Ellipse2D.Double(xLeft + 50, yTop + 100,100,50);
        
        g2.draw(moon);
        g2.setColor(Color.GRAY);
        g2.fill(moon);
        
        g2.draw(moonCraterLeft);
        g2.setColor(Color.BLACK);
        g2.fill(moonCraterLeft);
        
        g2.draw(moonCraterRight);
        g2.setColor(Color.BLACK);
        g2.fill(moonCraterRight);
        
        g2.draw(moonCraterCenter);
        g2.setColor(Color.BLACK);
        g2.fill(moonCraterCenter);
    }

}
