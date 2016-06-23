import java.util.Scanner;

public class FindWord
{
   public static void main(String[] args)
   {
      System.out.println("Word count: " + readAndCount() );
   }
   
   public static int readAndCount()
   {
      Scanner in = new Scanner(System.in);
      int count = 0;
      String word = "and";
      String line = " ";
      System.out.print("Enter five lines of text: ");
      for (int i = 0; i < 5; i++)
      {
         line = in.nextLine();
         count += count (line, word);
      }
      return count;
   }
   
   public static int count(String line, String word)
   {
      int count = 0, pos = 0;
      int index = s.indexof(word, pos);
      while (index != -1)
      {
         
      }
   }
}
