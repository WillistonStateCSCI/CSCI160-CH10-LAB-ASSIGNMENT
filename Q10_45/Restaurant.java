/* Restaurant Class
   Anderson, Franceschi
*/

public class Restaurant extends Store
{
  private int peopleServed;
  private double averagePrice;

  /**
  * Constructor:<BR>
  * Allows client to set beginning value for peopleServed, averagePrice
  * This constructor takes three parameters<BR>
  * Calls super constructor
  * Calls mutator methods
  * @param name the new name for the store
  * @param peopleServed the number of people served each year
  * @param averagePrice the averagePrice per person
  */
  public Restaurant( String name, int peopleServed, double averagePrice )
  {
    //Add code here to complete the constructor
  }

  /** getPeopleServed method
  * @return an int, the number of people served every year
  */
  public int getPeopleServed( )
  {
    //Add code here to return people served
    return 0;
  }

  /** getAveragePrice method
  * @return a double, the average price people pay at the restaurant
  */
  public double getAveragePrice( )
  {
    //Add code here to return average price
    return 0.0;
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of peopleServed
  * @param peopleServed the new number of people served every year
  *        if peopleServed is negative, then peopleServed is not changed
  */
  public void setPeopleServed( int peopleServed )
  {
    //Add code here to set people served
  }

  /**
  * Mutator method:<BR>
  * Allows client to set value of averagePrice
  * @param averagePrice the new value of averagePrice
  *        if averagePrice is negative, then averagePrice is not changed
  */
  public void setAveragePrice( double averagePrice )
  {
    //Add code here to set average price
  }

  /**
  * @return a string representation of the restaurant
  */
  public String toString( )
  {
    //Add code here to return object as string as shown in example output
    return "null";
  }

  /**
  * equals method
  * Compares two Restaurant objects for the same field values
  * @param  o another Restaurant object
  * @return a boolean, true if this object
  * has the same field values as the parameter r
  */
  public boolean equals( Object o )
  {
    //Add code here to determine if two objects are equal
    return false;
  }

  /**
  * averageTaxes method
  * Computes the average annual taxes paid by the restaurant
  * @return a double, the average annual taxes paid by the restaurant
  */
  public double averageTaxes( )
  {
    //Add code here to return average taxes
    return 0.0;
  }
}