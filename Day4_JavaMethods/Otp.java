public class Otp {
    public static void main(String[] args) {
        String[] otps = new String[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = genOtp();
            System.out.println(otps[i]);
        }
        System.out.println("All OTPs Unique: " + isUnique(otps));
    }

    public static String genOtp() {
        String otp = "";
        for (int i = 0; i < 6; i++)
