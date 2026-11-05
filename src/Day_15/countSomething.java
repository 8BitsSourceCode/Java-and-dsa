package Day_15;

public class countSomething {
    public static void main(String[]args){
        int count =0;
        for (int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                if(j==2){
                    count++;
                }
                System.out.print(j+" ");
            }
            for (int j=1;j<=i-1;j++){
                System.out.print("    ");
            }
            for (int j=6-i;j>=1;j--){
                if(j==2){
                    count++;
                }
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


        System.out.println(count);
    }
}
