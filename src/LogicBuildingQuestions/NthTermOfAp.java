package LogicBuildingQuestions;

public class NthTermOfAp {
    public static void main(String[] args) {
        int a1=2,a2=3,n=4;
        int d = a2-a1;
        n = a1 + (n-1)*d;
        System.out.println(n);
    }
}
