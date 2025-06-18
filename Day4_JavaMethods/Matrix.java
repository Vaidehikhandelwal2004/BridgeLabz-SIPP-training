public class Matrix {
    public static void main(String[] args) {
        int[][] a = create(2, 2);
        int[][] b = create(2, 2);

        System.out.println("Matrix A:");
        print(a);
        System.out.println("Matrix B:");
        print(b);

        System.out.println("Add:");
        print(add(a, b));
        System.out.println("Subtract:");
        print(sub(a, b));
        System.out.println("Multiply:");
        print(mul(a, b));
    }

    public static int[][] create(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = (int) (Math.random() * 10);
        return m;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] sub(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] mul(int[][] a, int[][] b) {
        int r = a.length, c = b[0].length, n = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int k = 0; k < n; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    public static void print(int[][] m) {
        for (int[] row : m) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }
}
