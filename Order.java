import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A class to represent the customers
 * Characteristics:
 *    Name: Name of customer
 *    OrderHistory: References the order class for the customer's order history
 *    PreferredDrinks: References the CafeItem class for the customer's preferred drink 
 */

public class Order {
  /** Instance Variables */
  private int orderID = 0;
  private Customer customer;
  private List<CafeItem> drinks = new ArrayList<>();
  private LocalDateTime orderTime;
  private String status = "";
  private Map<CafeItem, List<String>> customizations = new HashMap<>();
  

  /**
    * constructor to create a customer
    *
    * @param      name                 name of customer
    * @param      orderHistory         order hsitory of the drinks customers ordered
    * @param      preferredDrinks      preferred drinks customer ordered
    * @exception
    */

  public Order(int orderID, Customer customer, List<CafeItem> drinks, String status) throws OrderException {
    this.setOrderID(orderID);
    this.setCustomer(customer);
    this.setDrinks(drinks);
    this.setOrderTime(LocalDateTime.now());
    this.setStatus(status);
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
