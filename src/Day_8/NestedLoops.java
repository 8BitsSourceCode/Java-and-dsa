package Day_8;

public class NestedLoops {
    public static void main(String[]args){
        System.out.println("This will run 9 times");
        for (int i = 1;i<=3;i++){    // here i remains 1 until the j loop complete 1 iteration like 1,2,3
            for(int j = 1;j<=3;j++){  // then i = 2 j = 1,2,3

                System.out.println(i+" "+j); // then i = 3  j = 1,2,3


                // suppose like 3 shelves
                // 1 , 1 2 3  on shelve 1 going through all items
                // 2 , 1 2 3  on shelve 2 going through all items
                // 3 , 1 2 3  on shelve 3 going through all items

            }
        }
        System.out.println("This will run 8 times");
        for (int i=1;i<=2;i++){
            for(int j=1;j<=4;j++){
                System.out.println(i+" "+j);
            }
        }

        //  Pattern Thinking
        //  Nested loops can create patterns.

        for (int i=1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Next 3,i");
        for (int i = 1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.println(i+" "+j);
            }
        }
        System.out.println("Star for loop");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Next 3,3");
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
