public class PatternPractice {
    public static void main(String[] args) {
        int n =7;
        int st=2*n-1;
        int sp=0;
        for (int i =1;i<=n;i++){
            for (int j = 1;j<=sp;j++){
                System.out.print("\t" + "");
            }
            for (int j = 1;j<=st;j++){
                System.out.print("*\t");
            }
            System.out.println();
            st-=2;
            sp++;
        }
    }
}

/*public class PatternPractice {
    public static void main(String[] args) {
        int n =7;
        int st=2*n-1;
        int sp=0;
        for (int i =1;i<=n;i++){
            for (int j = 1;j<=sp;j++){
                System.out.print("\t" + "");
            }
            for (int j = 1;j<=st;j++){
                System.out.print("*\t");
            }
            System.out.println();
            st-=2;
            sp++;
        }
    }
}*/
