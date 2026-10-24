package Day_12;

public class Void_vs_Return {
//    void: The method does not return a value

    static void showTotal(){
        System.out.println(100+200);
    }
//    Calling showTotal(); prints 300,
//    but you cannot assign its result to an integer variable.


    static int calculateTotal() {
        return 100 + 200;
    }
//    return: Sends a value back to the caller

    public static void main(){
        // for void
//        int result = showTotal();
//        System.out.println(result); compile error

//        Why? Because showTotal() does not return an integer


        // for return

        int result = calculateTotal();
        System.out.println(result);





//        The key difference:
//        void method	                                     value-returning method
//        Does not return a value	                         Returns a value of its declared type
//        Often prints, displays or performs an action	     Often calculates and provides a result
//        static void greet()	static int add()
//        Cannot use its result as an int	                Can store its returned value in an int
//
//        Important point: Printing and returning are different.
//                - System.out.println(10) displays 10 on the screen.
//                - return 10; sends 10 back to the code that called the method.
//        A method declared void can use return; to exit early, but it cannot return a value such as return 10;.





    }
}
