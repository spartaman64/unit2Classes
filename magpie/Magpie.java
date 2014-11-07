import java.util.Scanner;

/**
 * Write a description of class Magpie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magpie
{
    public static void main(String[] args)
    {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Say something im giving up on you: ");
   String phrase = scanner.nextLine();
   
  
   if(phrase.equals("where did you come from"))
   {
       System.out.print("where did they go where did they come from cotton eyed joe");
    }
    else
    {
        System.out.print("I am a foriegner I did not understand");
    }

}
}
