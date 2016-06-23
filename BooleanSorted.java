/*
   5.2 c) A program which will determine if doubles are sorted
   from smallest to largest.
**/

public class BooleanSorted
{
   public static void main(String[] args)
   {
      boolean check = sorted(5, 6, 7);
      if (check == true)
      {
         System.out.println("These numbers are sorted: " +check);
      }
      else
      {
         System.out.println("These numbers are unsorted: " +check);
      }
   }
   
   public static boolean sorted(double x, double y, double z)
   {
      if ((x < y) || (y < z)) { return true; }
      else { return false; }
   }
}