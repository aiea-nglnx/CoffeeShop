
/**
 * A class to represent the customers
 * Characteristics:
 *    Name: Name of customer
 *    OrderHistory: References the order class for the customer's order history
 *    PreferredDrinks: References the CafeItem class for the customer's preferred drink 
 */

public class Customer {
  /** Instance Variables */
  private String name = "";
  private List<Order> orderHistory = new ArrayList<>();
  private List<CafeItem> preferredDrinks = new ArrayList<>();

  /**
    * constructor to create a customer
    *
    * @param      name                 name of customer
    * @param      orderHistory         order hsitory of the drinks customers ordered
    * @param      preferredDrinks      preferred drinks customer ordered
    * @exception
    */

  public Customer(String name, List<Order> orderHistory, List<CafeItem> preferredDrinks) throws CustomerException {
    this.setName(name);
    this.setOrderHistory(orderHistory);
    this.setPreferredDrinks(preferredDrinks);
  }


  /**
    * Returns a string representation of the Customer object.
    *
    * @return A formatted string containing the customer's name, orderHistory, and preferredDrinks.
    */
   // toString method
   public String toString() {
      String output = "";
      output += "\tName: " + this.name; // Adds the customer's name to output
      output += "\n\tOrder History: " + this.orderHistory; // Adds the list of the drinks the cutsomers purchase to the output
      output += "\n\tPreferred Drinks: " + this.preferredDrinks; // Adds the list of preferred drinks to the output
           
      return output;
   }
  
  /** Accessor/get methods */
  public String getName() {
    return this.name;
  }
  public List<Order> getOrderHistory() {
    return this.orderHistory;
  }
  public List<CafeItem> getPreferredDrinks() {
    return this.preferredDrinks;
  }

  /** Mutator/set methods */
  public void setName(String newName) throws CustomerException {
    if (name >= 2) {
      this.name = newName;
    }
    else {
        throw new CustomerException("ERROR! Sorry but customer's name must be at least 2 characters long.");
    }
  }
  public void setOrderHistory(List<Order> newOrderHistory) throws CustomerException {
    if (orderHistory == null) {
      throw new CustomerException("Order history cannot be null.");
    }
    else {
      this.orderHistory = new ArrayList<>(orderHistory);
    }
  }
    public void setPreferredDrinks(List<CafeItem> newPreferredDrinks) throws CustomerException {
       if (drinks == null || drinks.isEmpty()) {
            throw new IllegalArgumentException("Preferred drinks list cannot be empty.");
        }
      else {
        this.preferredDrinks = new ArrayList<>(drinks);
      }
    }
  }
