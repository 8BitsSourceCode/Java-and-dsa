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
      // conditions with &&
        double balance = 600;
        double amount = 2500;
        boolean AccountActive = true;

        if (balance >= amount && AccountActive ){
            System.out.println("Transaction Allowed ");
        }else{
            System.out.println("Transaction denied");
        }

        // OR ||
        boolean HasEmail = true;
        boolean HasPhone = false;

        if(HasEmail || HasPhone){
            System.out.println("Yes You can login");
        }

        // ! NOT

        boolean isBlocked = false;
        if (!isBlocked){
            System.out.println("Account is active");
        }



    }
}
