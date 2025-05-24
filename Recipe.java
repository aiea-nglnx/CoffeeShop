import java.util.ArrayList;

/**
 * A class to represent the recipes of the items sold in a cafe
 * Characteristics:
 *    Ingredients: A list of the required ingredients
 *    preparationTime: Time needed to prepare the drink
 *    temperature: whether it's hot or cold or warm
 *    steps: Instructions for making the drink
 */

public class Recipe {
  /** Instance Variables */
  private List<String> ingredients = new ArrayList<>();
  private int preparationTime = 0;
  private String temperature = "";
  private List<String> steps = new ArrayList<>();

  /**
    * constructor to create a Recipe
    *
    * @param      ingredients       list of required ingredients
    * @param      preparationTime   time required to prepare the drink
    * @param      temperature       determine the temperature of the drink (exampLe: hot or cold)
    * @param      steps             steps for making the drink
    * @exception
    */

  public Recipe(List<String> ingredients, int preparationTime, String temperature, List<String> steps) throws RecipeException {
    this.setIngredients(ingredients);
    this.setPreparationTime(preparationTime);
    this.setTemperature(temperature);
    this.setSteps(steps);  
  }


  /**
    * Returns a string representation of the CafeItem object.
    *
    * @return A formatted string containing the product's name, cost, size, and amount ordered.
    */
   // toString method
   public String toString() {
      String output = "";
      output += "\tIngredients: " + this.ingredients; // Adds the ingredient list to output
      output += "\n\tPreparation Time: " + this.preparationTime; // Adds the time to prepare the drink to output
      output += "\n\tTemperature: " + this.temperature; // Adds the temeprature of the drink to the output
      output += "\n\tSteps: " + this.steps; // Adds the steps for the drink
           
      return output;
   }
  /** Accessor/get methods */
  public List<String> getIngredients() {
    return this.ingredients;
  }
  public int getPreparationTime() {
    return this.preparationTime;
  }
  public String getTemperature() {
    return this.temperature;
  }
  public List<String> getSteps() {
    return this.steps;
  }

  /** Mutator/set methods */
  public void setIngredients(List<String> newIngredients) throws RecipeException {
    if (ingredients == null || ingredients.isEmpty()) {
      throw new RecipeException("Ingredients cannot be empty.");
    }
    else {
        this.ingredients = new ArrayList<>(ingredients);
    }
  }
  public void setPreparationTime(int newPreparationTime) throws recipeException {
    if (time > 0) {
      this.preparationTime = newPreparationTime;
    }
    else {
     throw new RecipeExcpetion("ERROR! Sorry but time must be a positive numerical value.");
    }
  }
  public void setTemperature(String newTemperature) throws RecipeException {
    if (newTemperature.equals("hot") || newTemperature.equals("cold/iced")) {
      this.temperature = newTemperature;
    }
    else {
      throw new RecipeException("ERROR! Sorry but " + newTemperature + " is an invalid temperature option.");
    }
  }
    public void setSteps(List<String> newSteps) throws RecipeException {
        if (steps == null || steps.isEmpty()) {
            throw new RecipeException("Steps cannot be empty.");
        }
        else {
          this.steps = new ArrayList<>(steps);
        }
    }
  }
