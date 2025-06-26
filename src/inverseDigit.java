import java.util.Scanner;

public class inverseDigit {
    public static void main(String[] args) {
        java.util.Scanner s = new Scanner(System.in);
        System.out.println("Enter any Number");
        // Declaration
        int orignalDigit = s.nextInt();
        int orignalPosition = 1;
        int inverse =0;


        // loop and logic building
        while(orignalDigit != 0){
            int inversePosition = orignalDigit % 10;
            int inverseDigit = orignalPosition;
            inverse = inverse + inverseDigit * (int)Math.pow(10, inversePosition - 1);
            orignalDigit /= 10;
            orignalPosition++;
        }
        System.out.println(inverse);
    }
}
