/*
   6.6) A program which using an array will calculate the
   alternating sum of all the elements in the array. And
   a method that implements said algorithm
   Allen Meadors
**/

public class ArraySum
{
   public static void main(String[] args)
   {
      int[] sum = new int[10];
      int[] altSum =  { 1, 4, 9, 16, 9, 7, 4, 9, 11 };
      int total = 0;
      for (int element : altSum)
      {
         total = element;
         for (int i = 0; i < sum.length; i++)
         {
            if (i % 2 == 0)
            {
               total = total + element;   
            }
            else
            { 
               total = total - element;
            }
         }
      }
      System.out.println(total);
   }
}   
      
   