package Day_12;

public class Method_call_declaration {
//    Declaration means defining what the method does:
static void greet() {
    System.out.println("Hello");
}
//    Calling means asking Java to execute it:
    public static void main(String[]args){
        greet();

//        Defining a method does not execute it automatically.
//        It normally runs when called, except for special mechanisms
//        such as constructors, initializers and framework callbacks.

    }

//    B. static vs non-static methods
//    A static method belongs to the class and
//        can be called from main() directly if accessible.

    static void greet1() {
        System.out.println("Hello");
    }

//    // Inside main()
//    greet();

//    A non-static method belongs to an object,
//    so you generally need an object to call it:

    void greet2() {
        System.out.println("Hello");
    }
//
//    // Inside main()
//    Main obj = new Main();
//obj.greet();

//    This matters because main() is static.
//    It cannot directly call a non-static instance method without an object.

}
