public class TriangleWithNumberAndCharacters {
    public static void main(String[] args) {
        int n = 5;
        int counter=1;
        int counterForChar=1;
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                if (i%2==0){
                    System.out.print(counter+"\t");
                    counter+=1;
                }else{
                    System.out.print((char)(counterForChar+64)+"\t");
                    counterForChar+=1;

                }

            }
            System.out.println();
        }
    }
}
