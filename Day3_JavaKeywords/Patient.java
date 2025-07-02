public class Patient {
    static String hospitalName = "Sunrise Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name, ailment;
    int age;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayPatientInfo() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Meera", 28, "Fever", 501);
        Patient p2 = new Patient("Aman", 34, "Injury", 502);

        p1.displayPatientInfo();
        p2.displayPatientInfo();

        Patient.getTotalPatients();
    }
}
