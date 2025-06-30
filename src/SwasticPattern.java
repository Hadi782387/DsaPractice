public class SwasticPattern {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= n; j++) { // columns

                // First row
                if (i == 1) {
                    if (j <= n / 2 + 1 || j == n) {
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }
                }

                // Upper half (excluding first and middle row)
                else if (i < n / 2 + 1) {
                    if (j == n / 2 + 1 || j == n) {
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }
                }

                // Middle row
                else if (i == n / 2 + 1) {
                    System.out.print("*\t");
                }

                // Lower half (excluding middle and last row)
                else if(i<n){
                    if (j == 1 || j == n / 2 + 1) {
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }
                }

                // Last row
                else  {
                    if (j == 1 || j >= n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }



            }
            System.out.println();
        }
    }
}
