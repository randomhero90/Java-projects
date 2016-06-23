import java.util.Scanner;

public class EvenNumbers
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      for(int i = 2; i <= 100; i+=2)
      {
         System.out.println(i);
      }
   }
}