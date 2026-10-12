package PracticeQna;

public class Operator2 {

    public static void main(String[] args){
        // true checks both the conditions  should be true then it will
        // give the ans as true else it gives the false for every other ans
        int age = 20;
        boolean hasid = true;

        System.out.println(age >= 20 && hasid);

        // it checks that only one condition should be true then it will give the ans as true

        boolean HasEmail = true;
        boolean HasID = false ;

        System.out.println(HasEmail || HasID);

        boolean CorrectUserName  = true;
        boolean  CorrectPassword = true;

        if (CorrectUserName && CorrectPassword){
            System.out.println("Login Successfull");
        }

    }
}
