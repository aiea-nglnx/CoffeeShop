/**
 * An interactive program Java program that models
 * an environment by creating classes for 2 related objects.
 * 
 * @author     Pao, Angelina
 * @thing      Object 1
 * @bugs       Short description of bugs in the program, if any.
 */
 
 public class Teacher {
   // Instance variables that represent Object 1's characteristics   
      private String name = "";
      private String academy = "";
      private boolean teachMixed = true;
      private int staffID = 0;
   
   // Constructor that allows you to create the Teacher object
   public Teacher (String name, String academy, int staffID, boolean teachMixed) {
      this.setName(name);
      this.setAcademy(academy);
      this.setTeachMixed(teachMixed);      
      this.setStaffID(staffID);
   }
   
   // toString method
   public String toString() {
      String output = "";
      output += "\tTeacher Name: " + this.name; // Adds teacher name to output
      output += "\n\tAcademy: " + this.academy; // Adds teacher academy to output
      output += "\n\tDo they teach a class with multiple academies: " + this.teachMixed; // Adds whether class is mixed to output
      output += "\n\tStaff ID: " + this.staffID; // Adds teacher staff id      
      return output;
   }
   
   // Accessor Methods to Teacher class that retrieves the teacher's attributes
   public String getName() {
      return this.name;
   }
    public String getAcademy() {
      return this.academy;
   }
   public int getStaffID() {
      return this.staffID;
   }
   public boolean teachMixed() {
      return this.teachMixed;
   }
   
   // Adding Mutator methods to Teacher class that allows modification
   public void setName(String newName) throws SchoolException {
    if (newName.length() >= 2) {
      this.name = newName;
    }
    else {      
      throw new SchoolException("ERROR! Teacher's name must be at least 2 characters long");
    }
   }
   public void setAcademy(String newAcademy) throws SchoolException {
    if (newAcademy.equals("Academy of Arts & Communication") || newAcademy.equals("Academy of Health & Sciences") || newAcademy.equals("Academy of Industrial & Engineering Technology") || newAcademy.equals("Academy of Natural Resources") || newAcademy.equals("Academy of Professional & Public Services")){  
     this.academy = newAcademy;
    }
    else {
     throw new SchoolException("ERROR! Sorry but " +  newAcademy + " must be 1 of the following and an applicable option");
    }
   }
   public void setStaffID(int newStaffID) throws SchoolException{
    if (newStaffID >= 10000 && newStaffID <= 99999) {  
     this.staffID = newStaffID;
    }
    else {
     throw new SchoolException("ERROR! Sorry but " + staffID + " must be a proper 5-digit long number.");
    }
   }
   public void setTeachMixed(boolean newTeachMixed) throws SchoolException{
    if (newTeachMixed.equals("true") || newTeachMixed.equals("false")) {  
     this.teachMixed = newTeachMixed;
    }
    else {
     throw new SchoolException("ERROR! Sorry but " + newTeachMixed + " must be either true or false.");
    }
   }
}
