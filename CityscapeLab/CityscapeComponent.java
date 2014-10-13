import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Background back = new Background(0,0);
        
        Building build = new Building(0,0);
        
        Moon moon = new Moon(0,0);
        
        UFO ufo = new UFO(0,0);
        
        int x = getWidth()+0;
        int y = getWidth()+0;
        
        back.draw(g2);
        build.draw(g2);
        moon.draw(g2);
        ufo.draw(g2);
        // create instances of classes and invoke the draw method on each
        // ...
        

        
    }

}
