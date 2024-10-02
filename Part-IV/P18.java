import java.util.Scanner;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}
class Employee extends Member {
    String specialization;

    void printEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Phone Number: " + phoneNumber);
        System.out.println("Employee Address: " + address);
        printSalary();
        System.out.println("Employee Specialization: " + specialization);
    }
}

class Manager extends Member {
    String department;

    void printManagerDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager Age: " + age);
        System.out.println("Manager Phone Number: " + phoneNumber);
        System.out.println("Manager Address: " + address);
        printSalary();
        System.out.println("Manager Department: " + department);
    }
}

// Main class
public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        Manager mgr = new Manager();

        System.out.println("Enter Employee Details:");
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Age: ");
        emp.age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Phone Number: ");
        emp.phoneNumber = sc.nextLine();
        System.out.print("Address: ");
        emp.address = sc.nextLine();
        System.out.print("Salary: ");
        emp.salary = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Specialization: ");
        emp.specialization = sc.nextLine();

        System.out.println("\nEnter Manager Details:");
        System.out.print("Name: ");
        mgr.name = sc.nextLine();
        System.out.print("Age: ");
        mgr.age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Phone Number: ");
        mgr.phoneNumber = sc.nextLine();
        System.out.print("Address: ");
        mgr.address = sc.nextLine();
        System.out.print("Salary: ");
        mgr.salary = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Department: ");
        mgr.department = sc.nextLine();

        System.out.println("\nEmployee Details:");
        emp.printEmployeeDetails();

        System.out.println("\nManager Details:");
        mgr.printManagerDetails();

        sc.close();
    }
}
