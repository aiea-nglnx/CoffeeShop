import java.util.Scanner;

/**
 * An interactive program Java program that models
 * an environment by creating classes for 2 related objects.
 * 
 * @author     Pao, Angelina
 * @assignment ICS 111 Assignment 10 - Object 1
 * @date       04/13/2025
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
      this.name = name;
      this.academy = academy;
      this.teachMixed = teachMixed;      
      this.staffID = staffID;
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
   public void setName(String newName) {
      this.name = newName;
   }
   public void setAcademy(String newAcademy) {
      this.academy = newAcademy;
   }
   public void setStaffID(int newStaffID) {
      this.staffID = newStaffID;
   }
   public void setTeachMixed(boolean newTeachMixed) {
      this.teachMixed = newTeachMixed;
   }
}