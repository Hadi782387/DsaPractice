public class DiagonalPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n;j++) {
                if(i==j){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }
}

        /*public class DiagonalPattern {
            public static void main(String[] args) {
                int n=5;
                int sp = 0;
                int st=1;
                for(int i = 1;i<=n;i++){
                    for(int j =1;j<=sp;j++) {
                        System.out.print("\t");
                    }
                    for(int j =1;j<=st;j++) {
                        System.out.print("*\t");
                    }
                        sp++;
                    System.out.println();
                }
            }
        }
        */




