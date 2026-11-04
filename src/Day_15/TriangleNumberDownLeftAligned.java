package Day_15;

public class TriangleNumberDownLeftAligned {
    public static void main(String[]args){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print("# ");
            }
            for (int j=1;j<=6-i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
//         1 2 3 4 5
//        #  1 2 3 4
//        # #  1 2 3
//        # # #  1 2
//        # # # #  1
    }
}
