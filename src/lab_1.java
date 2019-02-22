
public class lab_1 {
    //    Номер залікової - 8203
//    С2 = 1  -
//    C = С3 = 1
//    С5 = 5  +
//    С7 = 6  double
    public static void main(String[] args) {
        final int c = 1;
        final int a = 2;
        final int n = 3;
        final int b = 2;
        final int m = 3;
        double S = 0;
        if (c >= a && c <= n) {
            System.out.println("Division by zero");
        } else {
            for (double i = a; i <= n; i++) {
                for (double j = b; j <= m; j++) {
                    S += (float) (i + j) / (i - c);
                }
            }
            System.out.println("Result is: " + S);
        }
    }
}
