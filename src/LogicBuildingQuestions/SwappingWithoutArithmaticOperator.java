package LogicBuildingQuestions;

public class SwappingWithoutArithmaticOperator {
    public static void main(String[] args) {
        int a = 6 , b = 8;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        swap(a,b);
    }
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

}