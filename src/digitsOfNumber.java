public class digitsOfNumber {
    public static void main(String[] args) {
        int num = 234;
        int dig = 0;
        int temp=num;
        while(temp != 0){
            temp/=10;
            dig++;
        }
        int div = (int) Math.pow(10,dig-1);
        while (div!=0){
            int q = num/div;
            System.out.println(q);
            num %= div;
            div /= 10;
        }
    }
}
