public class matrisÇarpım {
    public static void main(String[] args) {
        int a[][] = {{2, 3}, {5, 10}, {4, 6}, {20, 40}};
        int b[][] = {{1, 2, 3}, {12, 15, 10}};
        int c[][] = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    c[i][j] = a[i][k] * b[k][j];
                }
            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}