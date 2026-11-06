package Day_16;

public class numberPyramid_1_to_5 {
    public static void main(String[]args){
        for (int i=1;i<=5;i++){
            for (int j=2;j<=i;j++){
                System.out.print("@");
            }
            for (int j=1;j<=6-i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
//     1 2 3 4 5
//    @ 1 2 3 4
//    @@ 1 2 3
//    @@@ 1 2
//    @@@@ 1
}
