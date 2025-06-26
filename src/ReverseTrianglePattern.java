public class ReverseTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        int sp = 0,st= n;
        for(int i =1;i<=n;i++) {
          //  System.out.println(sp+","+st);
            for(int j = 1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j = 1;j<=st;j++){
                System.out.print("*\t");
            }
            sp++;
            st--;

            System.out.println();
        }
    }
}
