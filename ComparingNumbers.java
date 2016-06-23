import java.util.Scanner;

/**
   A program which will recieve a user's input, add them, 
   take their difference, multiply and divide them, 
   average them, give you the distance between them, and 
   display the highest and the lowest of the two
   
*/

public class ComparingNumbers
{
   public  static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Please enter two values: ");
      float firstValue = in.nextFloat();
      float secondValue = in.nextFloat();
      
      //Computes the sum
      
      float theSum = firstValue + secondValue;
      System.out.printf("Sum: %14.2f", theSum);
      System.out.println();
      
      //Computes the difference
      
      float theDifference = firstValue - secondValue;
      System.out.printf("Difference: %7.2f", theDifference);
      System.out.println();
      
      //Computes the product
      
      float theProduct = firstValue * secondValue;
      System.out.printf("Product: %10.2f ", theProduct);
      System.out.println();
      
      //Computes the average
      
      float theAverage = (firstValue + secondValue) / 2;
      System.out.printf("Average: %10.2f " , theAverage);
      System.out.println();
      
      //Computes the distance
      
      float theDistance = Math.abs(firstValue - secondValue);
      System.out.printf("Distance: %9.2f ", theDistance);
      System.out.println();
      
      //Determines the maximum
      
      float theMaximum = Math.max(firstValue, secondValue);
      System.out.printf("Maximum: %10.2f ", theMaximum);
      System.out.println();
      
      //Determines the minimum
      
      float theMinimum = Math.min(firstValue, secondValue);
      System.out.printf("Minimum: %10.2f ", theMinimum);
      System.out.println();
   }
}