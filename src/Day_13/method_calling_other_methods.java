package Day_13;

public class method_calling_other_methods {
    static int square(int n){
        return n*n;
    }
    static int doubleSquare(int n){
        return square(n)*2;
    }

    public static void main(String[]args){

        System.out.println(doubleSquare(5));
    }
//            Dry run:
//            doubleSquare(5)
//                 ↓
//            square(5)
//               ↓
//              5 × 5
//              ↓
//              25
//              ↓
//              25 × 2
//              ↓
//              50
//             Output:
//              50
}
