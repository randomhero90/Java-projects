import java.util.Scanner;

/*
   A program that reads a users input (an integer number)
   then displays a diamond whose sides, being composed of
   astericks, equals the number (in astericks) the user input.
**/

public class DiamondAsterick
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Please input a nonnegative integer: ");
      int i = 0, j, k, n;
      n = input.nextInt(); //where n is the height
      
      for (k = 1; k <= (n + 1) / 2; k++) //top of the diamond
      {
         for (i = 0; i < n - k; i++)
         {
            System.out.print(" ");
         }
         for (j = 0; j < k; j++)
         {
            System.out.print("* ");
         }
         System.out.println("");
      }
      for (k = ((n + 1) / 2); k < n; k++) //bottom of the diamond
      {
         for (i = 1; i < k; i++) 
         {
            System.out.print(" ");
         }
         for (j = 0; j < n - k; j++)
         {
            System.out.print(" *");
         }
         System.out.println("");
      }
   }
}
            