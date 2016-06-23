public class CallingCard extends Card
{
   private String n;
   private String cardNumber;
   private String PIN;
   
   public CallingCard()
   {
      String n = "";
      String cardNumber = "";
      String PIN = "";
   }
   public CallingCard(String n, String CN, String security)
   {
      super(n);
      cardNumber = CN;
      PIN = security;
   }
   public String getName()
   {
      return n;
   }
   public String getNumber()
   {
      return cardNumber;
   }
   public int getPIN()
   {
      return PIN;
   }
   
   /* 
      Since your phone card will never expire, it will always return
      false, since no expiration date is given.
   **/
   
   public boolean isExpired()
   {
      return false;
   }
   
   public String format()
   {
      return "Card holder: " + n + "card number: " + cardNumber + "Pin #: " + PIN;
   }
}