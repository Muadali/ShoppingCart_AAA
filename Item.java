
public class Item {

		/**

		  * The name of the Item.

		  */

		  private String name;

		 

		  /**

		  * The price of the Item.

		  */

		  private double price;

		 

		  /**

		  * Creates an Item.

		  *

		  * @param name The name of the Item.

		  * @param price The price of the Item.

		  */

		  public Item(String name, double price) {

		    this.name = name;

		    this.price = price;

		  }

		 

		  /**

		  * Gets the name of the Item.

		  *

		  * @return The name of the Item.

		  */

		  public String getName() {

		    return name;

		  }

		 

		  /**

		  * Gets the price of the Item.

		  *

		  * @return The price of the Item.

		  */

		  public double getPrice() {

		    return price;

		  }

		 

		  /**

		  * Returns a string representation of the Item.

		  *

		  * @return A string representation of the Item.

		  */

		  @Override

		  public String toString() {

		    return name + ": $" + price;
		    
		  
	}

}
		  
