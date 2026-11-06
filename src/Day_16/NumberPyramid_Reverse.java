package Day_16;

public class NumberPyramid_Reverse {
    public static void main(String[]args){
        for (int i=1;i<=5;i++){
            for (int j=2;j<=i;j++){
                System.out.print(" ");

            }
            for (int j=5;j>=i;j--){
                System.out.print(" "+j);
            }
            System.out.println();
        }

//        5 4 3 2 1
//         5 4 3 2
//          5 4 3
//           5 4
//            5


    }
}
