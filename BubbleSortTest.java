/**
   The code for the bubble sort method, which will organize an 
   array, and will return it in descending order, from greatest 
   to least.
*/
public class BubbleSortTest
{
   public static void main(String[] args)
   {
      int[] numbers = { 5678, 5, 8, 14, 1 };
      bubblesort(numbers);
   }
   public static void bubblesort(int[] numbers)
   {
      int tempVar;
      for (int i = 0; i < numbers.length; i++)
      {
         for(int j = 0; j < numbers.length; j++)
         {
            if(numbers[i] < numbers[j])
            {
               tempVar = numbers [j];
               numbers [j] = numbers [i];
               numbers [i] = tempVar;
            }
         }
      }
      for (int i = 0; i < numbers.length; i++)
      {
         System.out.println(numbers[i]);
      }
   }
}
