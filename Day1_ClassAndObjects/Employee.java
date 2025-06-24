public class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", Id: " + id + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Asha", 101, 45000);
        e.display();
    }
}
