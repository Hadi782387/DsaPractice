public class DiamondPatternWithSpace {
        public static void main(String[] args) {
            int n = 5;
            int sp = 1,st=n/2+1;
            for(int x = 1;x<=n;x++){
              for(int j = 1;j<=st;j++){
                  System.out.print("*\t");
              }
                for(int j = 1;j<=sp;j++){
                    System.out.print("\t");
                }
                for(int j = 1;j<=st;j++){
                    System.out.print("*\t");
                }
                System.out.println();
                if(x<=n/2){
                    sp+=2;
                    st--;
                }else{
                    sp-=2;
                    st++;
                }
            }
        }
    }


