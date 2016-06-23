import java.util.Scanner;

public class AverageInput
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      String word = " ";
      int i = 0;
      int sum = 0;
      int x = 0;
      double average = 0;
      word = in.next();
      while(!(word.equals("Stop")))
      {
         x = Integer.parseInt(word);
         sum += x;
         i++;
         word = in.next();
      }
      average = (sum * 1.0) / (i * 1.0);
      System.out.println("Your average is: " + average);
   }
}