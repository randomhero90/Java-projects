import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

/*
   A program which will read a dollar, or euro ammount entered 
   by the user, then convert it to the other currency.
**/

public class CurrencyCalculator extends JFrame
{
      
   Scanner in = new Scanner(System.in);
   final int FRAME_WIDTH = 300;
   final int FRAME_HEIGHT = 400;
   
   private JButton button1 = new JButton("<");
   private JButton button2 = new JButton(">"); 
   private JLabel label1 = new JLabel("Dollars");
   private JLabel label2 = new JLabel("Euros");  
   private JLabel label3 = new JLabel("Rate");
   
   private CurrencyCalculator()
   {
      JPanel panel = new JPanel();
      panel.add(button1);
      panel.add(button2);
      panel.add(label1);
      panel.add(label2);
      panel.add(label3);
      add(panel);
      
      ActionListener buttonListener = new ButtonListener();
      button.addActionListener(buttonListener);
      
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setTitle("Currency Calculator");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setVisible(true);
   }
   
   //Calculates the conversion   
  
   public class Conversion 
   {

      private double Exchange;
      private double Dollars;
      private double Euros;
      private double conversionToEuros;
      private double conversionToDollars;
   
      public Conversion () 
      {
      
      }
      
      public double getExchange() 
      {
         return Exchange;
      }
      
      public void setExchange (double currentRate) 
      {
         this.Exchange = currentRate;

      }
      
      public double getDollars() 
      {
         return Dollars;
      }
      
      public void setDollars (double currentDollars) 
      {
         this.Dollars = currentDollars;
      }

      public double conversionToEuros() 
      {
         return (Exchange * Dollars);
      }
            
      public double getEuros() 
      {
         return Euros;
      }
      
      public void setEuros (double currentEuros) 
      {
         this.Euros = currentEuros;
      }

      public double conversionToDollars() 
      {
         return (Euros / Exchange);
      }
   }
   
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
         Conversion Converter1 = new Conversion();
      }
   }

   public static void main(String[] args)
   {
      JFrame frame = new CurrencyCalculator();
   }
}

   