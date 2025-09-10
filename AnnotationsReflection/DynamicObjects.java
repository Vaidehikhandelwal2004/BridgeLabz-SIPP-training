public class DynamicObject {
public static void main(String[] args) throws Exception {
        
        Class<?> clazz = Class.forName("Student");

       
        Object obj = clazz.getDeclaredConstructor().newInstance();

      
        Student student = (Student) obj;

        
        clazz.getDeclaredMethod("setName", String.class).invoke(student, "Vaidehi");
        clazz.getDeclaredMethod("setRollNo", int.class).invoke(student, 101);

        
        clazz.getDeclaredMethod("display").invoke(student);
    }
}

class Student {
    private String name;
    private int rollNo;

    public Student() {}

    public void setName(String name) { this.name = name; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }

    public void display() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }
}
