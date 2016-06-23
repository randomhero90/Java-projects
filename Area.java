public class Area
{
   public static void main(String[] args)
   {
      int x = 2;
      int y = 3;
      System.out.println("x:  " + x + " y:  " + y + " Sum:  " + sum(x, y));
   }
        
   /**
      Computes the sum of two arguments.
      @param a an int operand to be added
      @param b another int operand
      @return the sum of a and b 
   */
   public static int sum(int a, int b)
   {
      return a + b;
   }
}

