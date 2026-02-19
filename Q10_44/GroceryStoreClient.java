/* GroceryStoreClient class
   Anderson, Franceschi
*/

import java.text.DecimalFormat;

public class GroceryStoreClient
{
  public static void main( String [] args )
  {
    System.out.println("Generating gs1 Grocery Store named Eddie's, annual revenue of 3523450.45, not a chain");
    GroceryStore gs1 = new GroceryStore( "Eddie's", 3523450.45, false );

    System.out.println("Generating gs2 Grocery Store named Giant 43, annual revenue of 4321090.65, chain");
    GroceryStore gs2 = new GroceryStore( "Giant 43", 4321090.65, true );
    System.out.println();

    System.out.println("Printing both grocery stores: ");
    System.out.println( gs1 );
    System.out.println( gs2 );
    System.out.println();

    System.out.println("Setting gs2 annual revenue to 3523450.45 and chain to false");
    gs2.setAnnualRevenues( 3523450.45 );
    gs2.setChain( false );

    System.out.println("Checking to see if the two stores are equal...");
    if ( gs1.equals( gs2 ) )
      System.out.println( "gs1 and gs2 are equal" );
    else
      System.out.println( "gs1 and gs2 are not equal" );
    System.out.println();

    System.out.println("Setting gs2 name to Eddie's");
    gs2.setName( "Eddie's" );

    System.out.println("Checking to see if the two stores are equal...");
    if ( gs1.equals( gs2 ) )
      System.out.println( "gs1 and gs2 are now equal" );
    else
      System.out.println( "gs1 and gs2 are still not equal" );
    System.out.println();

    System.out.println("Printing out annual taxes for gs1...");
    DecimalFormat pricePattern = new DecimalFormat( "$#,##0.00" );
    System.out.println( "Annual taxes for " + gs1.getName( )
      + " are " + pricePattern.format( gs1.annualTaxes( ) ) );
  }
}