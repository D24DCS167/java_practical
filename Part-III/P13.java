/**Create a class called Employee that includes three pieces of 
information as instance variables—a first name (type 
String), a last name (type String) and a monthly salary 
(double). Your class should have a constructor that 
initializes the three instance variables. Provide a set and a 
get method for each instance variable. If the monthly salary 
is not positive, set it to 0.0. Write a test application named 
EmployeeTest that demonstrates class Employee’s 
capabilities. Create two Employee objects and display each 
object’s yearly salary. Then give each Employee a 10% 
raise and display each Employee’s yearly salary again.  */
  
class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
            this.monthlySalary = 0.0;
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void raiseSalary(double percentage) {
        double raiseAmount = monthlySalary * (percentage / 100);
        setMonthlySalary(monthlySalary + raiseAmount);
    }

    public void display() {
        System.out.println("Employee Name: " + firstName + " " + lastName);
        System.out.println("Employee's Yearly Salary: " + getYearlySalary());
    }
}

public class P13 {
    public static void main(String[] args) {
        Employee E1 = new Employee("Yashvi", "Gadhiya", 22500);
        Employee E2 = new Employee("Snehal", "Mishra", 30000);

        System.out.println("\nYearly Salaries before raise:");
        E1.display();
        E2.display();

        E1.raiseSalary(10);
        E2.raiseSalary(10);
        System.out.println("\n\nYearly Salaries after 10% raise:");
        E1.display();
        E2.display();
    }
}
