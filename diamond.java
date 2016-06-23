import java.util.Scanner;

/*
   A program that reads a users input (an integer number)
   then displays a diamond whose sides, being composed of
   astericks, equals the number (in astericks) the user input.
**/

public class diamond
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int no = input.nextInt();
      diamond access = new diamond();
      System.out.println("The shape for this is: ");
      access.diamond_res(no);
   }
    public String diamond_star(int no) //method1
    {
        if(no>0)
        {
            return "* " + diamond_star(no-1);
        }
        else
        {
            return " ";
        }
    }
     public String diamond_star1(int no)  //method2
    {
        if(no>0)
        {
            return " * " + diamond_star(no-1); //access method1
        }
        else
        {
            return " ";
        }
    }
    public String blankSpace(int no) //method3
    {
        if(no>0)
        {
            return " " + blankSpace(no-1);
        }
        else
        {
            return " ";
        }
    }
    public void diamond_res(int no) //method4
    {
        for(int i=1; i<no; i++)
        {
            System.out.print(blankSpace(no-i)); //access method3
             System.out.println(diamond_star(i)); //access method1
             
        }
         for(int i=0; i<no; i++)
        {
            System.out.println(diamond_star1(no-i)); //access method2
            System.out.print(blankSpace(i)); //access method3
        }
      
    }
     
}