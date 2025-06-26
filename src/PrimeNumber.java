public class PrimeNumber {
    public static void main(String[] args) {
        int Num = 19;
        int i;
        for (i = 2; i < Num; i++) {
            if (Num % i == 0) {
                System.out.println("Number is NOT prime");
                break;
            }
        }
        if (i == Num) {
            System.out.println("Number is prime");
    }
}
}