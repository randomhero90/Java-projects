public class DriverLicense extends Card
{
   private String n;
   private String expirationYear;
   private String currentYear;
   private int x;
   private int y;
   
   public DriverLicense()
   {
      String n = "";
      String expirationYear = "";
      String currentYear = "";
      int x = 0;
      int y = 0;
   }
   
   public DriverLicense(String n, String year, String check)
   {
      super(n);
      expirationYear = year;
      currentYear = check;
      x = Integer.parseInt(year);
      y = Integer.parseInt(check);
   }
   
   public String getName()
   {
      return n;
   }
   
   public int getYear()
   {
      return x;
   }
   
   public int getCheck()
   {
      return y;
   }
   
   /*
      Here an expiration date is given, therefore it must be 
      checked. A lot of casting was necessary to get this to
      work.
   **/
   
   public boolean isExpired()
   {
      if(x <= y)
      {
         return false;
      }
      else
      {
         return true;
      }
   }
   
   public String format()
   {
      if(isExpired() == false)
      {
         return "Name: " + n + "Year card expires: " + expirationYear;
      }
      else
      {
         return "Your driver's license is expired.";
      }
   }
}