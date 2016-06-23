import java.util.Scanner;

/**
   A program to calculate the expense of a new hybrid 
   versus a used nonhybrid car. Assuming an average of 15000
   miles driven per year, at an average gas price of $4 per 
   gallon. 
*/

public class CarCalculator
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      //Get prices of the cars
      
      System.out.print("Enter the price of the new car: ");
      float newCar = in.nextFloat();
      System.out.print("Enter the price of the used car: ");
      float usedCar = in.nextFloat();
      
      //Compute cost of ownership 
      
      float hybridCost = newCar + (((15000 / 50) * 4) * 5);
      float usedCost = usedCar + (((15000 / 30) * 4) * 5);
      hybridCost = newCar + (((15000 / 50) * 4) * 5);
      usedCost = usedCar + (((15000 / 30) * 4) * 5);
      
      
      //Print the cost of ownership
      
      System.out.print("The hybrid's cost over 5 years is: ");
      System.out.println(hybridCost);
      System.out.print("The used car's cost over 5 years is: ");
      System.out.println(usedCost);
   }
}
      

