public class Car
{
   private double fuelEfficiency;
   private double gasLevel;
   
   public Car(double fuelEfficiency)
   {
      this.fuelEfficiency = fuelEfficiency;
      gasLevel = 0;
   }
   
   public void addGas(double gas)
   {
      this.gasLevel = gasLevel + gas;
   }
   
   public void drive(double distance)
   {
      gasLevel -= distance / fuelEfficiency;
   }
   
   public double getGasLevel()
   {
      return gasLevel;
   }
   
   public static void main(String[] args)
   {
      Car myHybrid = new Car(50);
      myHybrid.addGas(20);
      myHybrid.drive(100);
      System.out.println(myHybrid.getGasLevel());
      
      Car yourHybrid = new Car(25);
      yourHybrid.addGas(20);
      yourHybrid.drive(100);
      System.out.println(yourHybrid.getGasLevel());
   }
}