

/**
 * Write a description of class Event here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Event
{
   private String eventName =  "";
   private int xweeks = 0;
   private int yDays = 0;
   public Event(String eventName, int xweeks, int yDays)
   {
     
    }
    public String toString()
    {
        String message = "Event name is "+eventName+" in "+xweeks+" weeks and "+yDays+" days";
        System.out.print(message);
        return message;
    }
   

}
