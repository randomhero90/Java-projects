import java.util.*;

public class ArrayListTest
{
   public static void main(String[] args)
   {
      My_ArrayList a = new My_ArrayList();
      My_ArrayList b = new My_ArrayList();
      a.addLast(1);
      a.addLast(4);
      a.addLast(9);
      a.addLast(16);
      b.addLast(9);
      b.addLast(7);
      b.addLast(4);
      b.addLast(9);
      b.addLast(11);
      System.out.print(a.toString());
      System.out.println(b.toString());
   }
}