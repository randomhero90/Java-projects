public class BillFold extends Card
{
   private String n;
   private String card1;
   private String card2;
   private int count;
   
   public BillFold()
   {
      String n = "";
      String card1 = "";
      String card2 = "";
      int count = 0;
      
   }
   public BillFold(String n, String slot1, String slot2, int x)
   {
      super(n);
      card1 = slot1;
      card2 = slot2;
      count = x;
   }
   public String getName()
   {
      return n;
   }
   public String getCard1()
   {
      return card1;
   }
   public String getCard2()
   {
      return card2;
   }
   public String checkCards()
   {
      if(card1 == null)
      {
         return "Slot one is empty.";
      }
      else if (card2 == null)
      {
         return "Slot two is empty.";
      }
      return "Both slots are filled.";
   }
   public boolean isExpired()
   {
      return false;
   }
   public int getExpiredCardCount()
   {
      if(isExpired() == true)
      {
         count++;
      }
      return count;
   }
   public String format()
   {
      return "Your first card is: " + card1 + "And your second card is: " + card2 + "number of expired cards: " + count;
   }
}