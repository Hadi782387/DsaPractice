public class SumOfElementsOfArray {
    public static void main(String[] args) {
        int[] arr = {12, 3, 23, 344, 11, 16};
        int sum =0;

        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);
    }
}
