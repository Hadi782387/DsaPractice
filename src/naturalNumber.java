public class naturalNumber {
    public static void main(String[] args) {
        int a = 20,SumOfNum = 0, EvenSum=0;

        for(int i = 1;i<=a;i++){
            if(i % 2 == 0 ){
                EvenSum += i;
            }
            SumOfNum += i;
        }
        System.out.println(SumOfNum);
        System.out.println(EvenSum);
    }
}
