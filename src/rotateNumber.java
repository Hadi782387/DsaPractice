public class rotateNumber {
    public static void main(String[] args) {
        int n = 23465;
        int k = -1;

        int temp = n;
        int nod = 0;

        // count number of digits
        while (temp > 0) {
            temp /= 10;
            nod++;
        }

        // handle k greater than nod
        k = k % nod;
        if (k < 0) {
            k += nod;  // for negative rotations
        }

        int div = 1; // will become 10^k
        int mul = 1; // will become 10^(nod-k)

        for (int i = 1; i <= k; i++) {
            div *= 10;
        }

        for (int i = 1; i <= nod - k; i++) {
            mul *= 10;
        }

        int q = n / div; // quotient -> first part
        int r = n % div; // remainder -> last k digits

        int rot = (r * mul + q); // new number

        System.out.println(rot); // should print 65234
 }
}
