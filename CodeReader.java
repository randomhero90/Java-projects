import java.util.Scanner;

/**
   A program which will ask the user for a zip code in the form
   of "|" and ":". The "|"s denote a one, while the ":" denote
   a zero. Using this method, the numbers 0-9 can be represented
   in order to make reading a zip code a more streamlined process.
   The program will take the user's input, and calculate the zip
   code based upon the encoding method. If the bar code is correct
   the zip code will be printes, if it is not correct, the user
   will recieve an error message.
*/

public class CodeReader
{
   public static String temp;
   public static String bar0;
   public static String bar1;
   public static String bar2;
   public static String bar3;
   public static String bar4;
   public static String bar5;
   public static String bar6;
   public static String bar7;
   public static String bar8;
   public static String bar9;
   public static String str;
   public static int numb;
   
   public CodeReader()
   {
      bar0 = "||:::"; bar1 = ":::||"; bar2 = "::|:|";
      bar3 = "::||:"; bar4 = ":|::|"; bar5 = ":|:|:";
      bar6 = ":||::"; bar7 = "|:::|"; bar8 = "|::|:";
      bar9 = "|:|::";
   }
   public static void main(String[] args)
   {
      CodeReader pos = new CodeReader();
      temp = pos.number();
      System.out.println(temp);
      pos.divide(temp);
   }
   public static String number()
   {
      System.out.println("Enter a barcode using : or | ");
      Scanner scn = new Scanner(System.in);
      String bar = scn.nextLine();
      return bar;
   }
 
   public static void getNumber(String temp)
   {
      System.out.println("");
      System.out.println(temp);
      if(temp.equals(bar0))
      {
		   numb = 0;
      }
      if(temp.equals(bar1))
      {
		   numb = 1;
      }
      if(temp.equals(bar2))
      {
		   numb = 2;
	   }
      if(temp.equals(bar3))
      {
		   numb = 3;
	   }
      if(temp.equals(bar4))
      {
		   numb = 4;
	   }
      if(temp.equals(bar5))
      {
		   numb = 5;
	   }
      if(temp.equals(bar6))
      {
   		numb = 6;
   	}
      if(temp.equals(bar7))
      {
	   	numb = 7;
	   }
      if(temp.equals(bar8))
      {
		   numb = 8;
	   }
      if(temp.equals(bar9))
      {
		   numb = 9;
	   }
      System.out.print(numb);
   }
   public static void divide(String temp)
   {
        Postal po = new Postal();
        str = temp.substring(1,6);
        po.getNumber(str);
        str = temp.substring(6,11);
        po.getNumber(str);
        str = temp.substring(11,16);
        po.getNumber(str);
        str = temp.substring(16,21);
        po.getNumber(str);
        str = temp.substring(21,26);
        po.getNumber(str);
 
   }
}