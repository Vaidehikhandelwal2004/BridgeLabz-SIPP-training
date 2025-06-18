public class Bonus {
    public static void main(String[] args) {
        int[][] salaryData = getSalaryService();
        double[][] bonusData = getNewSalary(salaryData);
        printSummary(salaryData, bonusData);
    }

    public static int[][] getSalaryService() {
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000;
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }

    public static double[][] getNewSalary(int[][] oldData) {
        double[][] newData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double bonus = oldData[i][1] > 5 ? oldData[i][0] * 0.05 : oldData[i][0] * 0.02;
            newData[i][0] = oldData[i][0] + bonus;
            newData[i][1] = bonus;
        }
        return newData;
    }

    public static void printSummary(int[][] oldData, double[][] newData) {
        double oldSum = 0, newSum = 0, bonusSum = 0;
        System.out.println("Old\tNew\tBonus");
        for (int i = 0; i < 10; i++) {
            System.out.println(oldData[i][0] + "\t" + Math.round(newData[i][0]) + "\t" + Math.round(newData[i][1]));
            oldSum += oldData[i][0];
            newSum += newData[i][0];
            bonusSum += newData[i][1];
        }
        System.out.println("Sum\t" + Math.round(oldSum) + "\t" + Math.round(newSum) + "\t" + Math.round(bonusSum));
    }
}
