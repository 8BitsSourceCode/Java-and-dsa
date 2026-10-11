package Day_6;

public class If_Else_decision {
    public static void main(String[] args){

//        if
//        if-else
//        else-if
//        Nested if
//        Ternary operator
//        switch


//        if Statement
        // syntax

//        if (condition) {
//            // code
//        }

        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to vote");
            System.out.println(" ");
        }
            //  if-else
        age = 16;

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }


        //else-if

        int marks = 85;

        if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 70) {
            System.out.println("B");
        } else if (marks >= 60) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }


        //  Nested if

        age = 20;
        boolean hasID = true;

        if (age >= 18) {

            if (hasID) {
                System.out.println("Entry allowed");
            }
        }

    }
}
