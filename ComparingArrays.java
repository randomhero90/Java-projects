/*
   6.9 A method which checks if two elements have the same
   arrays in the same order.
   Allen Meadors
**/

public class ComparingArrays
{
   public static void main(String[] args)
   {
      int test1 = equals(3, 7, 9);
      int test2 = equals(3, 7, 9);
      Sytem.out.println("These two sets of numbers are equal: " + test1);
   }
   
   public static boolean equals(int[] a, int[] b)
   {
      a = (1, 2, 3, 4);
      b = (1, 2, 3, 4);
      if (a == b)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}