package Day_7;

public class If_Else_1 {
    public static void main(String[] args){

        // if (condition) true --> execute code
        // False --> do nothing

        int marks = 91;
        int age = 20;
        int passwd = 2347;
        if (marks >= 90){
            System.out.println("Excellent");
        }
        if (age >= 18){
            System.out.println("You can vote");
        }
        if (passwd != 2346){
            System.out.println("Login Failed !");
        }

        //   else
        //   What if we want something to happen when the condition is false?


        age = 16;
        if (age >= 18) {
            System.out.println("Adult");
        }else{
            System.out.println("Minor");
        }

//        Output:
//        Minor
//        Flow:
//                age >= 18?
//                /      \
//             YES        NO
//             ↓          ↓
//             Adult       Minor


//        if-else Example
        marks = 75;
        if (marks >= 40){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        //   Multiple Conditions: else if
//        Sometimes there are more than two possibilities.
//                Suppose:
//        90–100 → A
//        80–89  → B
//        70–79  → C
//        60–69  → D
//        Below 60 → F

        marks = 85;

        if (marks >= 90){
            System.out.println("A");
        }
        else if (marks >= 80){
            System.out.println("B");
        }
        else if (marks >= 70){
            System.out.println("C");
        }
        else if (marks >= 60){
            System.out.println("D");
        }else {
            System.out.println("Fail");
        }

//        How else if Works



//        Java checks from top to bottom.
//        For:
//        int marks = 85;
//        Java asks:
//        marks >= 90?
//            ↓
//        false
//
//        marks >= 80?
//            ↓
//        true
//        Then it executes:
//        B
//        and stops checking the remaining else if conditions.
//                Visual:
//        marks >= 90?
//            │
//        NO
//            ↓
//        marks >= 80?
//            │
//        YES
//            ↓
//        "B"
//            ↓
//        STOP


//        Order Matters!
//                This is a very important programming concept.
//        Consider:
        marks = 95;
        if (marks >= 40) {
            System.out.println("Pass");
        } else if (marks >= 90) {
            System.out.println("Excellent");
        }

//        What happens?
//        The first condition:
//        95 >= 40
//        is already true.
//                So Java prints:
//        Pass
//        It never reaches:
//        else if (marks >= 90)
//            This is why conditions need to be designed carefully.
//                Correct ordering:
        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}
