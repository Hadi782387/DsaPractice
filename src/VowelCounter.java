public class VowelCounter {

    public static void main(String[] args) {
        String str = "Yaseen Is Learning GitHub";
        int count = countVowels(str);
        System.out.println("Vowel count: " + count);
    }

    public static int countVowels(String str) {
        int count = 0;

        // Convert entire string to lowercase to handle both cases
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }
}