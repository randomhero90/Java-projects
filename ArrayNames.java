import java.util.Scanner;

public class ArrayNames
{
   public static void main(String[] args)
   {
      final int LENGTH = 5;
      String[] names = new String[LENGTH];
      Scanner in = new Scanner(System.in);
      int currentSize = 0;
      System.out.print("Enter 5 names: ");
      for (int i = 0; i < names.length; i++)
      {
         names[i] = in.next();
      }
      for (int i = 0; i < names.length; i++)
      {
         names[i] = names[i].toUpperCase();
         System.out.println(names[i]);
      }
   }
}