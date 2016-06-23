//Next Executive inherits the Manager class

public class Executive extends Manager
{
   private String department; 

   public void setDepartment(String department) { this.department = department; } 
   public String getDepartment() { return this.department; } 
   public String toString() 
   { 
      return "Employee: " + getName() + " Salary: " + getSalary() + "Department: " + getDepartment(); 
   } 
}


