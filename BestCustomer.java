import java.util.ArrayList;
import java.util.Scanner;

/*
   6.30 a program which identifies the biggest spender at a
   supermarket, and prints his or her name.
**/

public class BestCustomer
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      ArrayList<Double> sales = new ArrayList<Double>();
      sales.add(in.nextDouble());
      System.out.println("Please enter sales total, Q to quit: ");
      
      while (in.hasNextDouble())
      {
         sales.add(in.nextDouble());
      }
      double largest = sales.get(0);
      for (int i = 1; i < sales.size(); i++)
      {
         if (sales.get(i) > largest)
         {
            largest = sales.get(i);
         }
      }
      for (double element : sales)
      {
         if (element == largest)
         {
            return element;
         }
      }
      
      ArrayList<String> names = new ArrayList<String>();
      names.add(in.next());
      System.out.println("Please enter the name of the customer, press return to quit: ");
      
      while (in.hasNext())
      {
         names.add(in.next());
      }
   }
   
   public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> names)
   {
      for (sales : names)
      {
         System.out.print(sales);
         System.out.print(names);
         System.out.print(element);
         System.out.print(" <== customer of the day ==> ");
         System.out.println();
      }
   }
}

      