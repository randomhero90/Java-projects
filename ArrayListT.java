import java.util.*;

public class ArrayListT
{
   public static void main(String[] args)
   {
      ArrayList<Integer> one = new ArrayList<Integer>();
      ArrayList<Integer> two = new ArrayList<Integer>();
      one.add(1);
      one.add(10);
      one.add(15);
      one.add(57);
      one.add(3);
      
      two.add(5);
      two.add(25);
      two.add(100);
      
      System.out.println(merge(one, two));
   }
   
   public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
   {
      ArrayList<Integer> result = new ArrayList<Integer>();
      int count = 0;
      if (a.size() > b.size())
      {
         for(int i = 0; i < b.size(); i++)
         {
            result.add(a.get(i));
            result.add(b.get(i));
            count++;
         }
         while(count < a.size())
         {
            result.add(a.get(count));
            count++;
         }
      }
      else 
      {
         for(int i = 0; i < a.size(); i++)
         {
            result.add(a.get(i));
            result.add(b.get(i));
            count++;
         }
         while(count < b.size())
         {
            result.add(b.get(count));
            count++;
         }
      }
      return result;
      
   }
}