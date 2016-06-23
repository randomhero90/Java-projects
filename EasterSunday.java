import java.util.Scanner;
/*
   A program which will read a input from the user for a year, 
   and using Carl Friedrich's algorithm, will calculate the
   date on which Easter Sunday falls on that year.
*/

public class EasterSunday
{
   public static void main(String[] args)
   {
      //Declare variables, and ask for a year to check from 
      //user
      
      int y = 0;
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      int e = 0;
      int g = 0;
      int h = 0;
      int j = 0;
      int k = 0;
      int m = 0;
      int r = 0;
      int n = 0;
      int p = 0;
      String month1 = "March";
      String month2 = "April";
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter the year you would like to test: ");
      y = in.nextInt();
      
      //Take the user's input, and calculate the date.
      
      a = y % 19;
      b = y / 100;
      c = y % 100;
      d = b / 4;
      e = b % 4;
      g = (8 * b + 13) / 25;
      h = (19 * a + b - d - g + 15) % 30;
      j = c / 4;
      m = (a + 11 * h)/ 319; 
      k = c % 4;
      r = (2 * e + 2 * j - k - h + m + 32) % 7;
      n = (h - m + r + 90) / 25;
      p = (h - m + r + n + 19) % 32;
      
      //Print out the date using if statements (know I am not 
      //supposed to).
      
      if (n == 3)
      {
         System.out.print("Easter falls on: " + month1 + " " + p + ", " + y + ".");
      }
      else if (n == 4)
      {
         System.out.print("Easter falls on: " + month2 + " " + p + ", " + y + ".");
      }
      
   }
}