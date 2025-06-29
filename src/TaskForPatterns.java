public class TaskForPatterns {
    public static void main(String[] args) {
        int n = 5;
        int st=1;
        int sp = n/2;
        int val =1;
        for (int i = 1;i<=5;i++){
            for (int j =1;j<=sp;j++){
                System.out.print("\t");
            }
            int cval = val;
            for (int j =1;j<=st;j++){
                System.out.print(cval+"\t");
                cval++;

            }
            System.out.println();
            if (i<=n/2){
                st+=2;
                sp--;
                val++;
            }else{
                st-=2;
                sp++;
                val--;

            }
        }
    }
}
/*
public class TaskForPatterns {
    public static void main(String[] args) {
        int n = 5;
        int st=1;
        int sp = n/2;
        int val =1;
        for (int i = 1;i<=5;i++){
            for (int j =1;j<=sp;j++){
                System.out.print("\t");
            }
            int C_val = val;
            for (int j =1;j<=st;j++){
                System.out.print(C_val+"\t");
                if (j <= st / 2){
                    C_val++;
                }else{
                    C_val--;
                }


            }
            System.out.println();
            if (i<=n/2){
                st+=2;
                sp--;
                val++;
            }else{
                st-=2;
                sp++;
                val--;

            }
        }
    }
}


public class TaskForPatterns {
    public static void main(String[] args) {
        int n = 5;
        int st=1;
        int sp = n/2;
        int val =1;
        for (int i = 1;i<=5;i++){
            for (int j =1;j<=sp;j++){
                System.out.print("\t");
            }

            for (int j =1;j<=st;j++){
                System.out.print(val+"\t");


            }
            System.out.println();
            if (i<=n/2){
                st+=2;
                sp--;
                val++;
            }else{
                st-=2;
                sp++;
                val--;

            }
        }
    }
}
/*
public class TaskForPatterns {
    public static void main(String[] args) {
        int n = 5;
        int st=1;
        int sp = n/2;
        int val =1;
        for (int i = 1;i<=5;i++){
            for (int j =1;j<=sp;j++){
                System.out.print("\t");
            }
            int C_val = val;
            for (int j =1;j<=st;j++){
                System.out.print(C_val+"\t");
                if (j <= st / 2){
                    C_val++;
                }else{
                    C_val--;
                }


            }
            System.out.println();
            if (i<=n/2){
                st+=2;
                sp--;
                val++;
            }else{
                st-=2;
                sp++;
                val--;

            }
        }
    }
}
*/


