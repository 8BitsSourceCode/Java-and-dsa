package Day_11;

public class Four_Types_of_parameters_in_Methods {

//    Type 1: No parameters, no return value
//    Takes no input and returns nothing.

    static void greet() {
        System.out.println("Hello!");
    }

//    Call it using greet();.
//    Real-world example: Displaying a welcome message.
//    The method doesn't need any input, and it doesn't give a result back.

//    Type 2: With parameters, no return value
//    Takes input but returns nothing.

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

//    Call it using greet("Rahul");.
//    Output: Hello Rahul
//    Real-world example: Displaying a message for a particular user.
//    The method receives a name but only prints the message.

//    Type 3: No parameters, with a return value
//    Takes no input but gives a result back.

    static int getPrice() {
        return 500;
    }

//    Call it using int price = getPrice();.
//    Output if you print price: 500
//    Real-world example: Returning a fixed delivery charge or a stored setting.
//    The method needs no argument from the caller but returns a value.


//    Type 4: With parameters, with a return value
//    Takes input and gives a result back.

    static int add(int a, int b) {
        return a + b;
    }

//    Call it using int total = add(10, 20);.
//    Output if you print total: 30
//    Real-world example: Calculating a shopping cart's subtotal.
//    The method receives prices or amounts and returns the calculated result.

    public static void main(String[]args){
        greet();
        greet("Vicky");
        int price = getPrice();
        System.out.println(price);
        System.out.println("Total : $ "+add(10,77));
    }

}
