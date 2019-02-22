
public class lab_1 {
    //    Номер залікової - 8203
//    С2 = 1  -
//    C = С3 = 1
//    С5 = 5  +
//    С7 = 6  double
    public static void main(String[] args) {
        double S = 0;
        int a = 2;
        int n = 3;
        int b = 2;
        int m = 3;
        if (a > 1) {
            for (double i = a; i <= n; i++) {
                for (double j = b; j <= m; j++) {
                    S += (float) (i + j) / (i - 1);
                }
            }
            System.out.println(S);
        } else {
            System.out.println("Division by zero");
        }
    }
}