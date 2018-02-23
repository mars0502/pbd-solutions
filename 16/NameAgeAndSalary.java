import java.util.Scanner;

public class NameAgeAndSalary {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("What is your name? ");
       String name = input.next();
       
       System.out.println("Thats a cool name! " + name + " How old are you? ");
       int age = input.nextInt();
       
       System.out.println("Wow you are old, " + age + " is ancient! " + name + " how much do you earn per year? ");
       double salary = input.nextDouble();
       
       System.out.print("Wow " + salary + " thats alot! ");
       }
}
