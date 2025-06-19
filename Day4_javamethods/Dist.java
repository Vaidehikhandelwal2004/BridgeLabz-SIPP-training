public class Dist {
    public static double kmToMi(double k) {
        return k * 0.621371;
    }

    public static double miToKm(double m) {
        return m * 1.60934;
    }

    public static double mToF(double m) {
        return m * 3.28084;
    }

    public static double fToM(double f) {
        return f * 0.3;
    }

    public static void main(String[] args) {
        System.out.println(kmToMi(10));
        System.out.println(miToKm(6.2));
        System.out.println(mToF(3));
        System.out.println(fToM(10));
    }
}
