

public class Main {
    public static void main(String[] args) {

        InPatient p1 = new InPatient("Sunny Singh", 21, 101, "covid", "Emergency", 9876543210L, 302, 4);
        OutPatient p2 = new OutPatient("Sunny Singh", 21, 101, "covid", "Emergency", 9876543210L);

        Doctor d1 = new Doctor("Dr. Saurabh Kumar", 1200, "Surgeon");

        p1.displayInfo();
        System.out.println(p1.getMedicalSummary());

        p2.displayInfo();
        System.out.println(p2.getMedicalSummary());

        d1.displayInfo();

        Bill b1 = new Bill(5000, 1200, 10);
        b1.calculateBill();
    }
}
