/*
   Programming exercise 5.2
   a) write a boolean allTheSame (double x, double y, double z)
   returning true if the arguments are all true
**/

public class BooleanSame
{   
   public static void main(String[] args)
   {
      boolean numbers = allTheSame(1039, 1039, 1039);
      if (numbers == true)
      {
         System.out.println("All the numbers are equal: " +numbers);
      }
      else
      {
         System.out.println("Not all the numbers are equal: " +numbers);
      }
   }

   // The method of comparing numbers for equality
   
   public static boolean allTheSame(double x, double y, double z)
   {
      if ((x == y) && (x == z)) { return true; }
      else { return false; }
   }
}
