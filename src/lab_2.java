public class lab_2 {
    public static void main(String[] args) {
        float[][] C = new float[3][2];
        float[][] matrix1 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        float[][] matrix2 = {{7, 7}, {7, 7}, {7, 7}};
        float[] averValueInRows = new float[3];
        System.out.println("Matrix1");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');

        System.out.println("Matrix2");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.print('\n');
        }

        System.out.print('\n');
        if (matrix1.length == matrix2.length || matrix1[0].length == matrix2[0].length) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
//                    C[i][j] = (matrix1[i][j] + matrix2[i][j]) % 2;
                    C[i][j] = (int) matrix1[i][j] ^ (int) matrix2[i][j];
                }
            }
        } else {
            System.out.println("Matrices have different shapes!");
        }
        System.out.println("Matrix C");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');

        for (int i = 0; i < C.length; i++) {
            float sum = 0;
            for (int j = 0; j < C[i].length; j++) {
                sum += C[i][j];
            }
            averValueInRows[i] = sum / C[0].length;
        }
        System.out.println("Average value for all rows in C");
        for (int i = 0; i < averValueInRows.length; i++) {
            System.out.println(averValueInRows[i]);
        }
    }
}
