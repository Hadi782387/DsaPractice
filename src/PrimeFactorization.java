public class PrimeFactorization {
    public static void main(String[] args) {
        int n = 32;
        for(int div = 2; div < n;div++){
            while(n%div==0){
                n/=div;
                System.out.print(div+" ");
            }
        }
        if(n != 1){
            System.out.print(n);
        }
    }
}
