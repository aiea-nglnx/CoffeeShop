/**
 * A class to represent an item sold in a cafe
 * Characteristics:
 *    Name: name of item for sale (example: Oreos)
 *    Cost: cost of item (ex. 2.95)
 *    Type: type of drink (example: latte, americano)
 *    Flavor: what flavor of drink/coffee
 *    Amount: amount of drinks they want to purchase (example: 2)
 */

public class CafeItem {
  /** Instance Variables */
  private String name = "";
  private double cost = 0.0;
  private String type = "";
  private String flavor = "";
  private int amount = -1;

  /**
    * constructor to create a VMItem
    *
    * @param      name              name of item (example:  oreos)
    * @param      cost              cost of item (example:  2.95)
    * @param      type              type of drink (example: latte)
    * @param      flavor            flavor of drink (example: strawberry)
    * @param      amount            number available for purchase (example: 10)
    * @exception  CafeItemException   name must be at least 2 characters
    * @exception  CafeItemException   cost must be at least $1.00
    * @exception  CafeItemException   type must be 2 characters
    * @exception  CafeItemException   flavor must be 2 characters
    * @exception  CafeItemException   amount must be between 0 - 15
    */

  public CafeItemException(String name, double cost, String type, String flavor, int amount) throws CafeItemException {
    this.setName(name);
    this.setCost(cost);
    this.setType(type);
    this.setFlavor(flavor);
    this.setAmount(amount);  
  }

  /** Accessor/get methods */
  public String getName() {
    return this.name;
  }
  public double getCost() {
    return this.cost;
  }
  public String getType() {
    return this.type;
  }
  public String getFlavor() {
    return this.flavor;
  }
  public int getAmount() {
    return this.Amount;
  }

  /** Mutator/set methods */
  public void setName(String newName) throws CafeItemException {
    if (newName.length() >= 5) {
      this.name = newName;
    }
    else {
      throw new CafeItemException("ERROR! Sorry but item name must be at least 5 characters long.");
    }
  }
  public void setCost( ) throws CafeItemException {

  }
}
