package Day_5;

public class ShiftOperators {
    public static void main(String[] args){

//                <<     Left shift
//                >>     Signed right shift
//                >>>    Unsigned right shift

            // Left shift

        int x =5;
        System.out.println(x << 1 );

        // binary
        // 5 = 0101
        // left shift
        // 1010  = 10
        //   so      5 << 1 = 10
        //   x << 1
        //   x * 2
        //   x << 2
        //   x * 4



//        Right Shift >>
        int a = 10;

        System.out.println(a >> 1);

// binary 10 = 1010 , right shift = 0101 = 5 ,   for +ve int x >> 1 or else  x/2



//        >>> Unsigned Right Shift

        int b = -8;

        System.out.println(b >>> 1);



    }
}
