// Write your short report here (-2 if there is no report)

/**
 * A class to configure the SnapShop application
 *
 * @author Kelly Eames
 * @version Version 1.0
 */
public class SnapShopConfiguration
{
  /**
   * Method to configure the SnapShop.  Call methods like addFilter
   * and setDefaultFilename here.
   * @param theShop A pointer to the application
   */
  public static void configure(SnapShop theShop)
  {

    theShop.setDefaultFilename("C:\\Users\\kelly\\OneDrive\\Desktop\\billg.jpg");
    theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
    theShop.addFilter(new FlipVerticalFilter(), "Flip Vertical");
    // add your other filters below
  }
}