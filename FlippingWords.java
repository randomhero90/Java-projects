import java.util.Scanner;

public class FlippingWords
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String s = in.next();
      for (int i = s.length()-1; i >= 0; i--)
      {
         System.out.print(s.charAt(i));
      }
      System.out.println();
   }
}
