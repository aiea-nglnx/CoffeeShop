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
      output += "\tOrder ID: " + this.orderID;     
      output += "\n\tCustomer: " + (customer != null ? customer.getName() : "Unknown");
      output += "\n\tOrder Time: " + this.orderTime;     
      output += "\n\tDrinks: " + this.drinks;
      output += "\n\tStatus: " + this.status;
     
           
      return output;
   }
  
  /** Accessor/get methods */
  public int getOrderID() {
      return thisorderID;
  }
  
  public Customer getCustomer() {
      return this.customer;
  }
  
  public List<CafeItem> getDrinks() {
      return this.drinks;
  }
  
  public LocalDateTime getOrderTime() {
      return this.orderTime;
  }
  
  public String getStatus() {
      return this.status;
  }
  
  public Map<CafeItem, List<String>> getCustomizations() {
      return this.customizations;
  }

  /** Mutator/set methods */
  public void setOrderID(int newOrderID) throws OrderException {
    if (newOrderID >= 10000 && newOrderID <= 99999) {
      this.orderID = newOrderID;
    }
    else {
        throw new OrderException("ERROR! Sorry but " + newOrderID + " must be a positive 5-digit long number.");
    }
  }
  
  public void setCustomer(Customer customer) throws OrderException {
      if (customer == null) {
          throw new OrderException("Customer cannot be null.");
      }
    else {
      this.customer = customer;
    }
  }

  public void setDrinks(List<CafeItem> drinks) throws OrderException {
      if (drinks == null || drinks.isEmpty()) {
          throw new OrderException("Drinks list cannot be empty.");
      }
      else {
        this.drinks = new ArrayList<>(drinks);
      }
  }

  public void setOrderTime(LocalDateTime orderTime) throws OrderException {
      if (orderTime == null) {
          throw new OrderException("Order time cannot be null.");
      }
      else {
        this.orderTime = orderTime;
      }
  }

  public void setStatus(String status) {
      if (status == null || status.trim().isEmpty()) {
          throw new OrderException("Order status cannot be empty.");
      }
      else {
        this.status = status;
      }
  }

  public void setCustomizations(Map<CafeItem, List<String>> customizations) {
      if (customizations == null) {
          throw new IllegalArgumentException("Customizations map cannot be null.");
      }
      else {
        this.customizations = new HashMap<>(customizations);
      }
  }
}
