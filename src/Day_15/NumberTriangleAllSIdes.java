package Day_15;

public class NumberTriangleAllSIdes {
    public static void main(String[]args){
        int count =0;
        for (int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print(j+" ");
            }
            for (int j=1;j<=i-1;j++){
                System.out.print(" #  ");
            }
            for (int j=6-i;j>=1;j--){
                System.out.print(" "+j);
            }
            System.out.println();
        }

                    // half pattern
        //        1 2 3 4 5  5 4 3 2 1
        //        1 2 3 4      4 3 2 1
        //        1 2 3          3 2 1
        //        1 2              2 1
        //        1                  1

        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==1&&j==1){
                    continue;
                }
                System.out.print(j+" ");
            }
            for (int j=4;j>=i;j--){
                System.out.print("  # ");
            }
            for (int j=i;j>=1;j--){
                if(i==1&&j==1){
                    continue;
                }
                System.out.print(" "+j);
            }
            System.out.println();
        }

//        1 2 3 4 5  5 4 3 2 1
//        1 2 3 4  #   4 3 2 1
//        1 2 3  #   #   3 2 1
//        1 2  #   #   #   2 1
//        1  #   #   #   #   1
//            #   #   #   #
//        1 2   #   #   #  2 1
//        1 2 3   #   #  3 2 1
//        1 2 3 4   #  4 3 2 1
//        1 2 3 4 5  5 4 3 2 1
    }
}
