package Day_4;

public class BitwiseOperator {
    public static void main(String[] args){
//                &     AND
//                |     OR
//                ^     XOR
//                ~     NOT


//             & Bitwise AND                                          this is bitwise
        int a = 5;
        int b = 3;
        System.out.println(a&b);

//    binary        5 = 0101
//                  3 = 0011
//                 ---------
//                      0001   = 1

//        Bitwise OR |

        int c = 5;
        int d = 3;

        System.out.println(c | d);

//     binary       5 = 0101
//                  3 = 0011
//                    ---------
//                      0111   = 7


//                    Bitwise XOR ^

//                    XOR means:
//                    Different → 1
//                    Same      → 0

//            5 = 0101
//            3 = 0011
//                ---------
//                0110  = 6

//        Very useful DSA trick
//        XOR is commonly used for finding a unique element.


        int[] nums = {2, 3, 2, 4, 3};

        int result = 0;

        for (int n : nums) {
            result = result ^ n;
        }

        System.out.println(result);



//        2 ^ 2 = 0
//        3 ^ 3 = 0
//        0 ^ 4 = 4  = 4





//        Bitwise NOT ~
//        Flips every bit.

        int x = 5;

        System.out.println(~x);

//        ~x = -(x + 1)
//        ~5 = -(5 + 1)
//                = -6


    }
}
