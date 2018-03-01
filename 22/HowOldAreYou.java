   import java.util.Scanner;

   public class HowOldAreYou {
      public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
   System.out.println("How old are you?");
   int age = input.nextInt();
   
   if (age < 16) {
      System.out.println("You cannot drive.");
      }
      
   if (age < 18) {
      System.out.println("You cannot vote.");
      }
      
   if (age < 25) {
      System.out.println("You cannot rent a car.");
      }
  
   if (age > 25) {
      System.out.println("You can do anything that is legal.");
      }


   }
   
}

      
   
      
