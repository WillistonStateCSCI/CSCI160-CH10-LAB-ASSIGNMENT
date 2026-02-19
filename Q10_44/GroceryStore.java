/* GroceryStore Class
   Anderson, Franceschi
*/

public class GroceryStore extends Store
{
  private double annualRevenues;
  private boolean chain;

  /**
  * Constructor:<BR>
  * Allows client to set beginning value for annualRevenues, chain
  * This constructor takes three parameters<BR>
  * Calls super constructor
  * Calls mutator methods
  * @param name the new name for the store
  * @param annualRevenues the new annual revenues
  * @param chain the new value of whether the store is part of a chain
  */
  public GroceryStore( String name, double annualRevenues, boolean chain )
  {
    //Add code here to complete the constructor
  }

  /** getAnnualRevenues method
  * @return a double, the annual revenues
  */
  public double getAnnualRevenues( )
  {
    //Add code here to return annual revenues
    return 0.0;
  }

  /** getChain method
  * @return a boolean, true if the store is part of a chain, false otherwise
  */
  public boolean getChain( )
  {
    //Add code here to return whether or not the store is part of a chain
    return false;
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of annualRevenues
  * @param annualRevenues the new annual revenues
  *        if annualRevenues is negative, then annualRevenues is not changed
  */
  public void setAnnualRevenues( double annualRevenues )
  {
    //Add code here to set Annual Revenues
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of chain
  * @param chain the new value of chain
  */
  public void setChain( boolean chain )
  {
    //Add code here to set chain
  }

  /**
  * @return a string representation of the grocery store
  */
  public String toString( )
  {
    //Add code here to return information as a string as shown in example printout  
  }

  /**
  * equals method
  * Compares two GroceryStore objects for the same field values
  * @param  o another GroceryStore object
  * @return a boolean, true if this object
  * has the same field values as the parameter gs
  */
  public boolean equals( Object o )
  {
    //Add code here to check if two objects are equal
  }

  /**
  * annualTaxes method
  * Computes the annual taxes paid by the store
  * @return a double, the annual taxes paid by the store
  */
  public double annualTaxes( )
  {
    //Add code here to complete annual taxes  
  }
}