import java.util.*;

public class Course {
    String name;
    Professor professor;

    public Course(String name) {
        this.name = name;
    }

    void assignProfessor(Professor p) {
        this.professor = p;
    }

    void showCourse() {
        System.out.println("Course: " + name + " | Taught by: " + (professor != null ? professor.name : "TBA"));
    }
}

class Student {
    String name;
    List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollCourse(Course c) {
        courses.add(c);
        System.out.println(name + " enrolled in " + c.name);
    }

    void showEnrolledCourses() {
        System.out.println("Student: " + name + " enrolled in:");
        for (Course c : courses) {
            c.showCourse();
        }
    }
}

class Professor {
    String name;

    public Professor(String name) {
        this.name = name;
    }

    void teachCourse(Course c) {
        c.assignProfessor(this);
        System.out.println(name + " assigned to teach " + c.name);
    }

    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Mehta");
        Professor prof2 = new Professor("Prof. Kapoor");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Data Structures");

        prof1.teachCourse(c1);
        prof2.teachCourse(c2);

        Student s1 = new Student("Ishita");
        Student s2 = new Student("Yash");

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);

        s1.showEnrolledCourses();
        s2.showEnrolledCourses();
    }
}
