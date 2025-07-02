public class Person {
    String n;
    int a;

   Person(String n, int a) {
        this.n = n;
        this.a = a;
    }

   Person(Person o) {
        this(o.n, o.a);
    }

    public static void main(String[] q) {
       Person p = new Person("Kai", 30);
       Person c = new Person(p);
        System.out.println(p.n + " " + p.a);
        System.out.println(c.n + " " + c.a);
    }
}
