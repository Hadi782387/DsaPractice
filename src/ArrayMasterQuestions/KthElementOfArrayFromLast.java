package ArrayMasterQuestions;

public class KthElementOfArrayFromLast {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int k = 3;
        returnKthElement(arr, k);
    }

    public static void returnKthElement(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k");
            return;
        }
        int indexFromStart = arr.length - k;
        System.out.println("The element at k-th position from end is: " + arr[indexFromStart]);
    }
}