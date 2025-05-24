/**
 * A class to represent an item sold in a cafe
 * Characteristics:
 *    Name: name of item for sale (example: Oreos)
 *    Cost: cost of item (ex. 2.95)
 *    Size
 *    Recipe reference
 *    Amount: amount of drinks they want to purchase (example: 2)
 */

public class CafeItem {
  /** Instance Variables */
  private String name = "";
  private double cost = 0.0;
  private String size = "";
  private int amount = -1;
  private Recipe recipe; // Reference variable for Recipe class

  /**
    * constructor to create a VMItem
    *
    * @param      name              name of item (example:  oreos)
    * @param      cost              cost of item (example:  2.95)
    * @param      size              size of drink (example: small, medium, large)
    * @param      amount            number available for purchase (example: 10)
    * @param      recipe            recipe for drink
    * @exception  CafeItemException   name must be at least 2 characters
    * @exception  CafeItemException   cost must be at least $1.00
    * @exception  CafeItemException   type must be either small, medium, or large
    * @exception  CafeItemException   amount must be between 0 - 15
    */

  public CafeItem(String name, double cost, String size, int amount, Recipe recipe) throws CafeItemException {
    this.setName(name);
    this.setCost(cost);
    this.setSize(size);
    this.setAmount(amount);
    this.setRecipe(recipe);
  }


  /**
    * Returns a string representation of the CafeItem object.
    *
    * @return A formatted string containing the product's name, cost, size, and amount ordered.
    */
   // toString method
   public String toString() {
      String output = "";
      output += "\tDrink Name: " + this.name; // Adds the drink' name to output
      output += "\n\tCost: " + this.cost; // Adds the cost of the drink to output
      output += "\n\tSize: " + this.size; // Adds the size of the drink to the output
      output += "\n\tQuantity: " + this.amount; // Adds the amount of drinks purchased
      output += "\n\tRecipe: " + this.recipe;
           
      return output;
   }
  /** Accessor/get methods */
  public String getName() {
    return this.name;
  }
  public double getCost() {
    return this.cost;
  }
  public String getSize() {
    return this.size;
  }
  public int getAmount() {
    return this.Amount;
  }
  public Recipe getRecipe() {
    return this.recipe;
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
  public void setCost(double newCost) throws CafeItemException {
    if (newCost >= 1.00) {
      this.cost = newCost;
    }
    else {
     throw new CafeItemExcpetion("ERROR! Sorry but item cost must be at least $1.00 and a numerical value.");
    }
  }
  public void setSize(String newSize) throws CafeItemException {
    if (newSize.equals("small") || newSize.equals("medium") || newSize.equals("large")) {
      this.size = newSize;
    }
    else {
      throw new CafeItemException("ERROR! Sorry but " + newSize + " is an invalid size option.");
    }
    public void setAmount(int newAmount) throws CafeItemExceptiom {
      if (newAmount >= 1) {
        this.amount = newAmount;
      }
      else {
        throw new CafeItemException("ERROR! Sorry but " + newAmount + " should be a positive numerical value above 0.");
      }
    }
    public void setRecipe(Recipe recipe) throws CafeItemException{
        if (recipe == null) {
            throw new CafeItemException("Recipe cannot be null.");
        }
        else {
          this.recipe = newRecipe;
        }
    }
  }
}
