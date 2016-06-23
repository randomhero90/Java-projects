/*
   5.2 b) boolean allDifferent, if three arguements do not 
   equal each other, return true.
**/

public class BooleanDifferent
{
   public static void main(String[] args)
   {
      boolean numbers = allDifferent(5, 5, 7);
      if (numbers == true)
      {
         System.out.println("All the numbers are different: " + numbers);
      }
      else
      {
         System.out.println("One or more numbers are the same: " + numbers);
      }
   }
   
   // The method of compare numbers for inequality
   
   public static boolean allDifferent(double x, double y, double z)
   {
      if ((x != y) && (x != z) && (y != z)) { return true; }
      else { return false; } 
   }
}