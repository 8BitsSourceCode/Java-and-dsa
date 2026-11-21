package Day_21_Strings;

public class comparingStringWhyNot {
    public static void main(String[]args){
        String username = "admin";
        String input = "admin";

        if (username.equals(input)){
            System.out.println("User name is correct ");
        }else{
            System.out.println("User name is incorrect ");
        }

//        For Strings, don’t generally use:
//        a == b
//        when your goal is to compare their textual contents.
//                Instead use:
//        a.equals(b)
//        Think:
//          ==
//          → compares references/identity
//                .equals  → compares content
//
//        Use .equals() to compare String contents.
    }
}
