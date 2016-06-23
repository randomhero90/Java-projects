import java.util.Scanner;

public class ComparingWords
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Type a word in common usage: ");
      String word1 = in.next();
      System.out.print("Type another word in common usage: ");
      String word2 = in.next();
      if (word1.substring(0, 3).equals("aaa"))
      {
         System.out.println("Your word does not start with 3 a's.");
      }
      if (word1.equals(word2))
      {
         System.out.println("Your words are the same.");
      }
      if (word1.compareTo(word2) < 0)
      {
         System.out.println(word1 + " comes before " + word2 + " in the dictionary.");
      }
      if (word1.substring(0, 3).equals(word2.substring(0, 3)))
      {
         System.out.println(word1 + " and " + word2 + " have the same first three letters.");
      }
   }
}      