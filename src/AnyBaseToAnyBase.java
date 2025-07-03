import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();   // number in base b1
        int b1 = s.nextInt();  // source base
        int b2 = s.nextInt();  // destination base

        int d = getValue(n, b1, b2); // ✅ correct function call
        System.out.println(d);
    }

    public static int getValue(int n, int b1, int b2) {
        int dec = anyBaseToDecimal(n, b1);         // convert to decimal
        return decimalToAnyBase(dec, b2);
    }

    public static int decimalToAnyBase(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % b;
            n /= b;
            rv += dig * p;
            p *= 10;
        }
        return rv;
    }

    public static int anyBaseToDecimal(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % 10;
            n /= 10;
            rv += dig * p;
            p *= b;
        }
        return rv;
    }
}
