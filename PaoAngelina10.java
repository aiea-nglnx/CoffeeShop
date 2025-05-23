import java.util.Scanner;

/**
 * An interactive program Java program that models
 * an environment by creating classes for 2 related objects.
 * 
 * @author     Pao, Angelina
 * @assignment ICS 111 Assignment 10
 * @date       04/13/2025
 * @bugs       Short description of bugs in the program, if any.
 */
 
public class PaoAngelina10 {
   public static void main(String[] args) {
   
      // Beginning program variables
      Scanner reader = new Scanner(System.in);
      String greetings = ""; // Stores the user's name
      
      // Prompt the user to enter their name and greet them when the program runs
      System.out.print("Greetings, what's your name? ");
      
      greetings = reader.nextLine();
      System.out.println("\nHey " + greetings.toUpperCase() + "!" + " This program models a school." +
         "\nThis model contains 2 objects: Teacher & Computer ");
       
      // Prompt the user that they are printing the teacher object  
      System.out.println("\nI am printing the Teacher object with System.out.println(teacher.toString());");

      // Create the teacher object using the constructor
      Teacher teacher1 = new Teacher("Luca Nam", "Academy of Industrial & Engineering Technology (IET)", 2761, true);

      // Display the teacher object information      
      System.out.println(teacher1.toString());
      
      // Prompt the user that they printing the computer object 
      System.out.println("\nI am printing the Computer object with System.out.println(computer1);");

      // Create the computer object using the contructor
      Computer computer1 = new Computer("DELL", "XPS 16 Laptop", 512);
      System.out.println(computer1);
      
      // Prompting user that the Teacher object will change
      System.out.println("\nI am using a set method to change the Teacher object teacher1's Academy " +
      " Academy of Health & Sciences, then printing again: ");
      
      teacher1.setAcademy("Academy of Health & Sciences (AHS)");
      
      // Display the updated teacher object information      
      System.out.println(teacher1.toString());
      
      // Prompting user that the Computer object brand name will be displayed
      System.out.println("\nI am using a get method to print the Computer object computer1's Brand Name " +
      "in this sentence: ");
      
      System.out.println("The brand of the teacher's computer is: " + computer1.getBrandName());

   }
}