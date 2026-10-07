package Day_4;

public class LogicalOperators {
    public static void main(String[] args){
        /*
        && AND
        || OR
        !  NOT
*/


        // && AND
        //Both conditions must be true

//        A	     B	    A && B
//        true	true	true
//        true	false	false
//        false	true	false
//        false	false	false


        int age = 20;

        if (age >= 18 && age <= 60) {
            System.out.println("Valid age");
        }
        //or
        int marks = 80;

        if (marks >= 40 && marks <= 100) {
            System.out.println("Pass");
        }

        //     || OR
        //      At least one condition must be true.

//        Truth table:
//        A	     B	    A || B
//        true	true	true
//        true	false	true
//        false	true	true
//        false	false	false

        int day = 6;

        if (day == 6 || day == 7) {
            System.out.println("Weekend");
        }




            //     ! NOT
        //   Reverses the result

        boolean raining = false;

        System.out.println(!raining);

//        !true  → false
//        !false → true


        boolean loggedIn = true;

        if (!loggedIn) {
            System.out.println("Please login");
        }

    }

}
