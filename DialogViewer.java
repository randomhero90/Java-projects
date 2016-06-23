/*Written 1/29/2014 by Allen Meadors
*a program designed to accept input from the user
*and then tell them in a frightening 2001: A Space Odyssey 
*fashion that the program cannot aquiesce
*/

import javax.swing.JOptionPane;

public class DialogViewer
{
   public static void main(String[] args)
   {
      String name = JOptionPane.showInputDialog("What is your name?");
      System.out.println(name);
      String response = JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
      System.out.print("I'm sorry, ");
      System.out.print(name);
      System.out.print(". I'm afraid I can't do that.");
   }
}