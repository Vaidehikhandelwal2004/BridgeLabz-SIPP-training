public class Convert {
    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double lbToKg(double p) {
        return p * 0.453592;
    }

    public static double kgToLb(double k) {
        return k * 2.20462;
    }

    public static double galToL(double g) {
        return g * 3.78541;
    }

    public static double lToGal(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println(fToC(98));
        System.out.println(cToF(37));
        System.out.println(lbToKg(10));
        System.out.println(kgToLb(5));
        System.out.println(galToL(2));
        System.out.println(lToGal(10));
    }
}
