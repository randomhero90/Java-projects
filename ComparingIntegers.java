import java.util.Scanner;

public class ComparingIntegers
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number between -255 and 255: ");
      int x = in.nextInt();
      System.out.print("Enter another number between -255 and 255: ");
      int y = in.nextInt();
      if (x > 0)
      {
         System.out.print(x + " is a positive number.");
      }
      else if (x <= 0)
      {
         System.out.print(x + " is less than or equal to 0.");
      }
      else if (x >= 10)
      {
         System.out.print(x + " is at least 10.");
      }
      else if (x < 10)
      {
         System.out.print(x + " is greater than 0 but less than 10.");
      }
      else if (x == 0 && y == 0)
      {
         System.out.print(x + y + " both equal 0.");
      }
      else if (x % 2 == 0)
      {
         System.out.print(x + " is even.");
      }
   }
}



