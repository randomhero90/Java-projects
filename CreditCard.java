import java.util.Scanner;
/**
   A program to check the validity of an 8 digit credit card
   number using the 
*/

public class CreditCard
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      if (args.length == 0) return;

      CreditCard card = new CreditCard(args[0]);
      System.out.println("Enter your card number: ");
      int cardNumbers = in.nextInt();
      int cardDigits = 0;
      int cardToNumbers = 0;

      if (!card.isValidNumber()) 
      {
         card.setCheckDigit(card.getValidCheckDigit());
      }
   }

   private final String cardText;
   private final int[] cardDigits;
   private final int cdIndex;

   public CreditCard(String ct) 
   {
      cardDigits = cardToNumbers(cardText = ct);

      if ((cdIndex = cardDigits.length - 1) < 0) 
      {
         throw new IllegalArgumentException("# had no digits");
        }
    }

    public boolean isValidNumber() 
    {
       return calcTotalSum(cardDigits) % 10 == 0;
    }

    public void setCheckDigit(int dig) 
    {
      cardDigits[cdIndex] = dig;
    }

    public int getValidCheckDigit() 
    {
      int sum = calcTotalSum(cardDigits);
      
      if (sum % 10 != 0) 
      {
         return cardNumbers[cdIndex] - sum % 10;
      } 
      
      else 
      {
         return cardNumbers[cdIndex];
      }
   }
}