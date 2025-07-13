

class Doctor {
    String doctorName;
    int fees;
    String specialization;

    Doctor(String doctorName, int fees, String specialization) {
        this.doctorName = doctorName;
        this.fees = fees;
        this.specialization = specialization;
    }

    void displayInfo() {
        System.out.println("Doctor Name: " + doctorName + ", Fees: " + fees + ", Specialization: " + specialization);
    }
}

