import java.util.*;

public class Company {
    String companyName;
    List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
    }

    void addEmployeeToDepartment(String deptName, String empName, int empId) {
        for (Department dept : departments) {
            if (dept.name.equals(deptName)) {
                dept.addEmployee(empName, empId);
                return;
            }
        }
        System.out.println("Department not found!");
    }

    void showCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }

    void deleteCompany() {
        departments.clear();
        System.out.println("Company '" + companyName + "' and all departments & employees are deleted.");
    }

    class Department {
        String name;
        List<Employee> employees;

        Department(String name) {
            this.name = name;
            this.employees = new ArrayList<>();
        }

        void addEmployee(String empName, int empId) {
            Employee e = new Employee(empName, empId);
            employees.add(e);
        }

        void showEmployees() {
            System.out.println("Department: " + name);
            for (Employee e : employees) {
                e.display();
            }
        }

        class Employee {
            String name;
            int id;

            Employee(String name, int id) {
                this.name = name;
                this.id = id;
            }

            void display() {
                System.out.println("Employee ID: " + id + ", Name: " + name);
            }
        }
    }

    public static void main(String[] args) {
        Company company = new Company("TechNova");

        company.addDepartment("Development");
        company.addDepartment("HR");

        company.addEmployeeToDepartment("Development", "Alice", 101);
        company.addEmployeeToDepartment("Development", "Bob", 102);
        company.addEmployeeToDepartment("HR", "Charlie", 201);

        company.showCompanyStructure();

        company.deleteCompany();  // deletes departments and employees (composition)
    }
}
