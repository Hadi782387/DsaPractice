public class sumOfPrime {
    public static void main(String[] args) {

        int low = 1;
        int high = 100;
        for (int n = low; n <= high; n++) {

            int count = 0;

            for (int i = 2; (i * i)<=n; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(n);
            }
        }
    }
}