
public class ShoppingCart {
	
	private static final boolean False = false;

	/**

	  * The bag of Items in the shopping cart.

	  */

	  private ArrayBag cart;

	 

	  /**

	  * Creates an empty shopping cart.

	  */

	  public ShoppingCart() {

	    cart = new ArrayBag<Item>();

	  }

	 

	  /**

	  * Adds an Item to the shopping cart.

	  *

	  * @param item The Item to add to the shopping cart.

	  */

	  public void add(Item item) {

	    cart.add(item);

	  }

	 

	  public <T> boolean add (T newEntry) {

	  boolean result= true;

	  if (isArrayFull()) {

	  result= False;


	  }

	 

	  else {

	  int numberOfEntries = 0;

	T[] bag = null;

	bag[numberOfEntries]=newEntry;

	  numberOfEntries++;

	 

	  }

	return result;

	  }

	 

	  private boolean isArrayFull() {


	return false;

	}



	/**

	  * Removes an Item from the shopping cart.

	* @param <T>

	  *

	  * @param item The Item to remove from the shopping cart.

	  */

	 

	public <T> T remove() {

	  return null;

	 

	  }

	 

	  /**

	  * Clears the shopping cart.

	  */

	  public void clear() {

	   

	  }//end clear

	 

	  /**

	  * Gets the number of Items in the shopping cart.

	  *

	  * @return The number of Items in the shopping cart.

	  */

	  //public int getNumItems() {

	    //return cart.getCurrentSize();

	// }

	 

	  public <T> boolean contains (T anEntry) {

	 

	  checkIntegrity();

	  boolean found= false;

	  int index=0;

	 

	  int numberOfEntries = 0;

	while (!found&& (index<numberOfEntries)) {

	  if (anEntry.equals(anEntry)) {

	 

	  found=true;

	 

	  }//end if

	 

	  index++;

	 

	  }//end while


	return found;

	 

	 

	  }

	 

	  private void checkIntegrity() {

	// TODO Auto-generated method stub


	}



	 

	/**

	  * Gets the total cost of the Items in the shopping cart.

	  *

	  * @return The total cost of the Items in the shopping cart.

	  */

	  public double getTotalPrice() {

	double total = 0;

	    for (Item item : cart) {

	      total += item.getPrice();

	    }

	    return total;

	  }

	 

	 

	  /**

	  * Returns a string representation of the shopping cart.

	  *

	  * @return A string representation of the shopping cart.

	  */

	  @Override

	public String toString() {

	    StringBuilder str = new StringBuilder();

	    for (Item item : cart) {

	      str.append(item + "\n");

	    }

	    return str.toString();

	 

	  }



	public String getTotalPrice1() {


	return null;

	}



	public String getNumItems() {

	// TODO Auto-generated method stub

	return null;

	}



	}

}
