import java.io.*;
import java.util.*;

public class FileTest
{
   public static void main(String[] args) throws IOException
   {
      Scanner in = new Scanner("This is fun,Sample Text,Sample Text");
      in.useDelimiter(",");
      while (in.hasNext())
      {
         System.out.println(in.next());
      }
      in.close();
   }
}