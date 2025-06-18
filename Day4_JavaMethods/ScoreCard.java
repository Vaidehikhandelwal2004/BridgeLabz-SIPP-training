public class ScoreCard {
    public static void main(String[] args) {
        int n = 5;
        int[][] scores = genScores(n);
        double[][] result = calcAll(scores);
        display(scores, result);
    }

    public static int[][] genScores(int n) {
        int[][] s = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                s[i][j] = 50 + (int)(Math.random() * 50);
        return s;
    }

    public static double[][] calcAll(int[][] s) {
        double[][] r = new double[s.length][3];
        for (int i = 0; i < s.length; i++) {
            int total = s[i][0] + s[i][1] + s[i][2];
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;
            r[i][0] = total;
            r[i][1] = Math.round(avg * 100.0) / 100.0;
            r[i][2] = Math.round(per * 100.0) / 100.0;
        }
        return r;
    }

    public static void display(int[][] s, double[][] r) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPer");
        for (int i = 0; i < s.length; i++)
            System.out.println(s[i][0] + "\t" + s[i][1] + "\t" + s[i][2] + "\t" + r[i][0] + "\t" + r[i][1] + "\t" + r[i][2]);
    }
}
