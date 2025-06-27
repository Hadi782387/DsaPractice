public class countingDigit {
    public static void main(String[] args) {
        int num = 342;
        int dig=0;

        while (num != 0) {

            num /= 10;
            dig+=1;

        }

        System.out.println(dig);
    }
}
