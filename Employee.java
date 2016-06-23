/**
   9.9 Make a class employee that will show the employee's name,
   department, and salary. And a program that will call said 
   class and test it.
*/

public class Employee //First the employee class
{
   private String name;
   private float salary;
   
   public void setName(String name) { this.name = name; } 
   public String getName() { return this.name; } 
   public void setSalary(float salary) { this.salary = salary; } 
   public float getSalary() { return this.salary; }
   public String toString() 
   { 
      return "Employee: " + getName() + " Salary: " + getSalary(); 
   }  
}
