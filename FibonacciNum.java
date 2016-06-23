/**
   A program that computes fibonacci numbers to the nth place
   karisa
*/

public class FibonacciNum
{
   public static void main(String[] args)
   {
      int n = 45;
      for (int i = 1; i <= n; i++)
      {
         long f = fib(i);
         System.out.println("fibonacci (" + i + ") = " + f);
      }
   }
   public static long fib(int n)
   {
      if (n <= 2) { return 1; }
      else { return fib(n - 1) + fib(n - 2); } 
   }
}