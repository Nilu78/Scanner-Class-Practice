
import java.util.*;

class Main {
  
  
  public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
    
        System.out.println("Welcome to ChatBotApp. Tell me your name:");

       String name = input.nextLine();

    System.out.println("Hi " + name + "! Nice to meet you! How old are you: ");
    
    int age = input. nextInt();

    System.out.println("That's not too old. What is your phone no: ");
    
    long phoneNo = input.nextInt();
    
    System.out.println("Great, what is your gender: ");
    
    String gender = input.next();

   

    System.out.println("Thank you. Here's what I know about you.");

     
        //Write your code here

    System.out.println("Your name is " + name + 
                       ".You are " + gender +
                       ".Your phone number is " + phoneNo +
                       ".Your age is " + age +
                       "."); 
                       
    



  }
}