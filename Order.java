import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** OrderStatus enum **/
public enum OrderStatus {
  PENDING, COMPLETED, CANCELED, IN_PROGRESS
}

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
  private LocalDateTime lastUpdated;
  private OrderStatus status;
  private Map<CafeItem, List<String>> customizations = new HashMap<>();
  

  /**
    * constructor to create a customer
    *
    * @param      name                 name of customer
    * @param      orderHistory         order hsitory of the drinks customers ordered
    * @param      preferredDrinks      preferred drinks customer ordered
    * @exception
    */

  public Order(int orderID, Customer customer, List<CafeItem> drinks, OrderStatus status) throws OrderException {
    this.setOrderID(orderID);
    this.setCustomer(customer);
    this.setDrinks(drinks);
    this.setOrderTime(LocalDateTime.now());
    this.setLastUpdated(LocalDateTime.now());
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
      output += "\n\tLast Updated: " + this.lastUpdated;
      output += "\n\tDrinks: " + this.drinks;
      output += "\n\tStatus: " + this.status;     
           
      return output;
   }
  
  /** Accessor/get methods */
  public int getOrderID() {
      return this.orderID;
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
  public LocalDateTime getLastUpdated() {
      return this.lastUpdated;
  }
  
  public OrderStatus getStatus() {
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
      this.customer = newCustomer;
    }
  }

  public void setDrinks(List<CafeItem> newDrinks) throws OrderException {
      if (newDrinks == null || newDrinks.isEmpty()) {
          throw new OrderException("Drinks list cannot be empty.");
      }
      else {
        this.drinks = new ArrayList<>(newDrinks);
      }
  }

  public void setOrderTime(LocalDateTime newOrderTime) throws OrderException {
      if (newOrderTime == null) {
          throw new OrderException("Order time cannot be null.");
      }
      else {
        this.orderTime = newOrderTime;
      }
  }

  public void setStatus(OrderStatus newStatus) throws OrderException {
      if (newStatus == null) {
          throw new OrderException("Order status cannot be empty.");
      }
      else {
        this.status = newStatus;
      }
  }

  public void updateStatus(OrderStatus newStatus) throws OrderException {
    if (newStatus == null) {
      throw new OrderException("Order status cannot be null.");
    }
    else if (this.status == OrderStatus.COMPLETED) {
      throw new OrderException("Cannot update a completed order.");
    }
    else {
      this.status = newStatus;
      this.lastUpdated = LocalDateTime.now(); // Track status change time
    }
  }

  public void updateStatusEvents(String newEvent) throws OrderException {
    if (newEvent == null || newEvent.trim().isEmpty()) {
      throw new OrderException("Event type cannot be null or empty.");
    }
    switch (newEvent.toLowerCase()) {
      case "prepared":
        this.status = OrderStatus.IN_PROGRESS;
        break;
      case "picked_up":
        this.status = OrderStatus.COMPLETED;
        break;
      case "canceled":
        this.status = OrderStatus.CANCELED;
        break;
      default:
        throw new OrderException("ERROR! Invalid event type: " + newEvent);
    }
    this.lastUpdated = LocalDateTime.now();
  }
  public void setCustomizations(Map<CafeItem, List<String>> newCustomizations) throws OrderException {
      if (newCustomizations == null) {
          throw new OrderException("Customizations map cannot be null.");
      }
      else {
        this.customizations = new HashMap<>(newCustomizations);
      }
  }
}
