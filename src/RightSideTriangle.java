public class RightSideTriangle {
    public static void main(String[] args) {
        int rows = 5;
        int sp = 4,st= 1;
        for(int i =1;i<=rows;i++) {
           // System.out.println(sp+","+st);
            for (int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for (int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();

        }

    }
}
