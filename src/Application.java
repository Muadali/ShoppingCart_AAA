
public class Application {
	

		public static void main(String[] args) {


		ShoppingCart cart = new ShoppingCart();

		   

		    // Test adding items to the cart.

		    cart.add(new Item("Apple", 0.99));

		    cart.add(new Item("Banana", 0.59));

		    cart.add(new Item("Cherry", 1.29));

		   

		  // Test getting the number of items in the cart.

		  System.out.println("Number of items in cart: " + cart.getNumItems());

		   

		    // Test getting the total price of the items in the cart.

		  System.out.println("Total price of items in cart: $" + cart.getTotalPrice());

		   

		    // Test removing items from the cart.

		    //cart.remove(new Item("Banana", 0.59));

		   

		    // Test clearing the cart.

		    cart.clear();

		   

		    // Test getting the number of items in the cart again.

		    System.out.println("Number of items in cart: " + cart.getNumItems());

		} 

}
