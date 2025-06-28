public class HollowDiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        int os = n/2;
        int is = -1;
        for(int i = 1;i<=n;i++){                                   // only print 5 rows
            for(int j =1;j<=os;j++) {                               //print outer space
                System.out.print("\t");
            }

            System.out.print("*\t");                                //print Stars

            for(int j =1;j<=is;j++) {                            // print inner space
                System.out.print("\t");
            }
            if (i > 1 && i < n){
                System.out.print("*\t");                        // print stars for 1st and last rows
            }
            if(i<=n/2){
                os--;
                is+=2;
            }else{
                os++;
                is-=2;
            }
            System.out.println();
        }
    }
}
