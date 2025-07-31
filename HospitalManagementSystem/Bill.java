class Bill implements Payable {
    int roomCharges;
    int doctorFees;
    int discount;

    Bill(int roomCharges, int doctorFees, int discount) {
        this.roomCharges = roomCharges;
        this.doctorFees = doctorFees;
        this.discount = discount;
    }

    public void calculateBill() {
        int total = roomCharges + doctorFees;
        double finalAmount = total - (total * discount / 100.0);
        System.out.println("Total Bill after " + discount + "% discount: " + finalAmount);
    }
}