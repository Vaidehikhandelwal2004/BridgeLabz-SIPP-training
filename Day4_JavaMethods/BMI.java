import java.util.Scanner;

public class BMI {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0;
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal weight";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
        }

        calculateBMI(teamData);
        String[] bmiStatus = determineBMIStatus(teamData);

        System.out.println("\nPerson | Weight | Height | BMI | Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("  %d    | %.1f kg | %.1f cm | %.2f | %s%n", (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], bmiStatus[i]);
        }
    }
}
