public class palindromeCheck {
    public static void main(String[] args) {
        int num=12321;
        int on=num;
        int dig;
        int rn=0;
        while(num>0) {
            dig = num % 10;
            rn=rn*10+dig;
            num /= 10;
        }
        System.out.println(on==rn?"palindrome":"not");
    }
}
