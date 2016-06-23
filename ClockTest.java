import java.util.*;

public class ClockTest
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of hours (1-24): ");
      int hours = in.nextInt();
      System.out.println("Enter the number of minutes (1-60): ");
      int minutes = in.nextInt();
      
      Clock clock1 = new Clock(hours, minutes);
      System.out.println(clock1);
      clock1.printAmPm();
   }   
}
