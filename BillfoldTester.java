/*
   The BillfoldTester displays polymorphism, because the arguments
   passed in the tester, are then passed to their corresponding
   objects. They inherit the arguments passed from this program.
**/
public class BillfoldTester
{
   public static void main(String[] args)
   {
      BillFold billfold1 = new BillFold();
      billfold1.BillFold(Card(), IDCard(), CallingCard(), 0);
      
   }
}