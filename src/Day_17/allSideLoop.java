package Day_17;

public class allSideLoop {
    public static void main(String[]args){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=6-i;j++){
                System.out.print(j+" ");

            }
            for (int j=2;j<=i;j++){
                System.out.print(" #  ");
            }
            for (int j=6-i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();

            // next half

        }

        for (int i=2;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for (int j=4;j>=i;j--){
                System.out.print(" #  ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
