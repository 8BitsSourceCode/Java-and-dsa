package Day_7;

public class Nested_IF {
    public static void main(String[] args){

//        An if can exist inside another if

        int age = 20;
        boolean hasID = true;

        if (age >= 18) {

            if (hasID) {
                System.out.println("Entry allowed");
            }

//            Think:
//            Age >= 18?
//                ↓
//            YES
//                ↓
//            Has ID?
//                ↓
//            YES
//                ↓
//            Entry allowed
//            Nested conditions are useful, but too much nesting can make code difficult to understand.

        }


    }
}
