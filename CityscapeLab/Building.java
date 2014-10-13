import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Creates a building and the features of a building.
 * 
 * @author (John Li) 
 * @version (1.0)
 */
public class Building 
{
    private int xLeft;
    private int yTop;
    /**
     * constructor for building
     * parameters set x and y coordnates of where the building is located
     */
    public Building(int x, int y)
    {
        xLeft = x;
        yTop = y;
      }
      
    /**
     * drawing the building, windows and door and puting them in the right place on the ground
     * the parameters calls the graphics2d method g2 in cityscapecomponent
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double bottomFloor
        = new Rectangle2D.Double (xLeft + 100, yTop + 370,200,200);
        
        Rectangle2D.Double windowUpper
        = new Rectangle2D.Double(xLeft +120, yTop + 390,160,50);
        
        Rectangle2D.Double windowLower
        = new Rectangle2D.Double(xLeft +120, yTop + 460,160,50);
        
        Rectangle2D.Double door
        = new Rectangle2D.Double(xLeft +170, yTop + 520,50,50);
        
        g2.draw(bottomFloor);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(bottomFloor);
        
        g2.draw(windowUpper);
        g2.setColor(Color.YELLOW);
        g2.fill(windowUpper);
        
        g2.draw(windowLower);
        g2.setColor(Color.YELLOW);
        g2.fill(windowLower);
        
        g2.draw(door);
        g2.setColor(Color.RED);
        g2.fill(door);
    }

}
