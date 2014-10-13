

/**
 * A car class tracks fuel capacity and consumption based on efficiency
 * 
 * @author John
 * @version 12 September
 */
public class Car
{
    /**Fuel efficiency of car measured in mpg */
    private double fuelEfficiency;
    
    /**amount of fuel in gas tank g*/
    private double fuelInTank;

    /**
     * Constructor that specifies the fuel efficiency of this car
     */
    public Car(double efficiency)
    {
        // initialise instance variables
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     *The drive method reduces the fuel in the tank based on the 
     *specified miles and the efficiency of this car
     *
     * @pre        this method is never invoked with a value for 
     * miles that consumes more than the 
     * avalible gas in the tank
     * @param    miles    number of miles driven
     */
    public void drive(double miles)
    {
        // put your code here
        double gallonsBurned = miles/this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;
    }
    
    /**
     *adds tge specified amount of gas in gallons to this car's tank
     *
     * @pre        the specified amount of gas doesnt exceed the capacity of this cars tank
     * @param   gallons    number of gallons of gas to add
     */
    public void addGas(double gallons)
    {
        // put your code here
        this.fuelInTank = this.fuelInTank + gallons;
    }
    
    /**
     *Returns the number of gallons of gas remaing in this cars tank
     *
     *@return number of gallons of gas remaining in this cars tank
     */
    public double getGasInTank()
    {
        // put your code here
        return this.fuelInTank;
    }
}
