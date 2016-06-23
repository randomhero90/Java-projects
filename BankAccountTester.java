public class BankAccountTester
{
   public static void main(String[] args)
   {
      Portfolio allensAccount = new Portfolio(1000, 1500);
      allensAccount.deposit(1500, "C");
      allensAccount.withdraw(500, "S");
      allensAccount.transfer(500, "S");
      System.out.printf("%.2f\n", allensAccount.getBalance("C"));
   }
}