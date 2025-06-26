public class ReverseDiagonal {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i+j==n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");

                }
            }
            System.out.println();
        }
    }
}
/*
public class ReverseDiagonal {
    public static void main(String[] args) {
        int n= 5;
        int sp = n-1,st = 1;
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j =1;j<=st;j++){
                System.out.print("*\t");
            }
            System.out.println();
            sp--;
        }
    }
}
*/
