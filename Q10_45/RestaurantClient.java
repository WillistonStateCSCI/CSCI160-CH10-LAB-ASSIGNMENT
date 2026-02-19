/* RestaurantClient class
   Anderson, Franceschi
*/

import java.text.DecimalFormat;

public class RestaurantClient
{
  public static void main( String [] arr )
  {
    System.out.println("Generating new restraurant r1 named Bistro 120, 12000 people served, meals costing approx $25.60");
    Restaurant r1 = new Restaurant( "Bistro 123", 12000, 25.60 );

    System.out.println("Generating new restaurant r2 named Chez Louis, 9800 people served, meals costing approx $39.85");
    Restaurant r2 = new Restaurant( "Chez Louis", 9800, 39.85 );
    System.out.println();

    System.out.println("Printing both restaurants...");
    System.out.println( r1 );
    System.out.println( r2 );
    System.out.println();

    System.out.println("Setting r2 people served to 1200 and average price per meal to 25.599999");
    r2.setPeopleServed( 12000 );
    r2.setAveragePrice( 25.599999);
    
    System.out.println("Checking to see if the two restaurants are equal...");
    if ( r1.equals( r2 ) )
      System.out.println( "r1 and r2 are equal" );
    else
      System.out.println( "r1 and r2 are not equal" );
    System.out.println();

    System.out.println("Setting the name of r2 to Bistro 123...");
    r2.setName( "Bistro 123" );

    System.out.println("Checking to see if the two restaurants are equal...");
    if ( r1.equals( r2 ) )
      System.out.println( "r1 and r2 are now equal" );
    else
      System.out.println( "r1 and r2 are still not equal" );
    System.out.println();

    System.out.println("Calculating the average taxes for r1...");
    DecimalFormat pricePattern = new DecimalFormat( "$#,##0.00" );
    System.out.println( "Average annual taxes for " + r1.getName( )
      + " are " + pricePattern.format( r1.averageTaxes( ) ) );
  }
}