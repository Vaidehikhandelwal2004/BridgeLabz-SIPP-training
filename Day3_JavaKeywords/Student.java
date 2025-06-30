public class Student {
    static String universityName = "Global University";
    static int studentCount = 0;

    final int rollNumber;
    String name, grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        studentCount++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + studentCount);
    }

    void displayStudentInfo() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Riya", 101, "A");
        Student s2 = new Student("Raj", 102, "B");

        s1.displayStudentInfo();
        s2.displayStudentInfo();

        Student.displayTotalStudents();
    }
}
