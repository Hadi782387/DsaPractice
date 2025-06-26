public class DiamondPattern {
    public static void main(String[] args) {
        int n = 9;
        int sp = n/2,st=1;
        for(int x = 1;x<=n;x++){
            for (int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for (int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(x<=n/2){
                sp--;
                st+=2;
            }else{
                sp++;
                st-=2;
            }
        }
    }
}
