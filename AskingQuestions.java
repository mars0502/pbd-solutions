import java.util.Scanner;

public class AskingQuestions {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("How old are you? ");
      int age  = input.nextInt();
      
      System.out.print("How feet tall are you? ");
      String height = input.next();
      
      System.out.print("And how many inches tall? ");
      String Inches= input.next();
      
      System.out.print("How much do you weight?");
      double weight = input.nextDouble();
      
      System.out.println("So you're " + age + " old, " + height + " tall and " + weight + " heavy.");
    }
}    
