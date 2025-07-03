import java.util.*;

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}


abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

 
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Final Salary: " + calculateSalary());
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("------------------------");
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }
}


class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}


class PartTimeEmployee extends Employee {
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double hourlyRate, int workHours) {
        super(id, name, 0); // baseSalary not used directly
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    public double calculateSalary() {
        return hourlyRate * workHours;
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
       
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee ft1 = new FullTimeEmployee(101, "Alice", 30000, 5000);
        ft1.assignDepartment("HR");

        PartTimeEmployee pt1 = new PartTimeEmployee(102, "Bob", 500, 20);
        pt1.assignDepartment("Support");

        employees.add(ft1);
        employees.add(pt1);

        
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
