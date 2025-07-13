

interface Payable {
    void calculateBill();
}

public class Patient {

    private String patientName;
    private int age;
    private int patientId;
    private String medicalHistory;
    private String admissionType;
    private long contactNumber;

    Patient(String patientName, int age, int patientId, String medicalHistory, long contactNumber) {
        this.patientName = patientName;
        this.age = age;
        this.patientId = patientId;
        this.medicalHistory = medicalHistory;
        this.contactNumber = contactNumber;
        this.admissionType = "Normal";
    }

    public Patient(String patientName, int age, int patientId, String medicalHistory, long contactNumber, String admissionType) {
        this(patientName, age, patientId, medicalHistory, contactNumber);
        this.admissionType = admissionType;
    }

    public String getMedicalSummary() {
        return "Name: " + patientName + ", Age: " + age + ",Patient Id:  " + patientId + ", History: " + medicalHistory + ",Contact Number: " + contactNumber;
    }

    public void displayInfo() {
        System.out.println("Patient ID: " + patientId + " age: " + age + " Name: " + patientName + ", Admission: " + admissionType + " medicalHistory:" + medicalHistory + " Contact Number :" + contactNumber);
    }
}

class InPatient extends Patient {
    int roomNumber;
    int daysAdmitted;

    InPatient(String patientName, int age, int patientId, String medicalHistory, String admissionType, long contactNumber, int roomNumber, int daysAdmitted) {
        super(patientName, age, patientId, medicalHistory, contactNumber, admissionType);
        this.roomNumber = roomNumber;
        this.daysAdmitted = daysAdmitted;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("room Number:" + roomNumber + " days Admitted:" + daysAdmitted);
    }
}

class OutPatient extends Patient {

    OutPatient(String patientName, int age, int patientId, String medicalHistory, String admissionType, long contactNumber) {
        super(patientName, age, patientId, medicalHistory, contactNumber, admissionType);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: OutPatient");
    }
}
