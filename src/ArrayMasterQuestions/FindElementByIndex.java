package ArrayMasterQuestions;

public class FindElementByIndex {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        printElementByIndex(numbers, 2);  // index 2 -> 30
        printElementByIndex(numbers, 4);  // index 4 -> 50
        printElementByIndex(numbers, 6);  // invalid index
    }

    // method to print element by index
    public static void printElementByIndex(int[] arr, int idx) {
        if (idx >= 0 && idx < arr.length) {
            System.out.println("Element at index " + idx + " = " + arr[idx]);
        } else {
            System.out.println("Invalid index: " + idx);
        }
    }
}
