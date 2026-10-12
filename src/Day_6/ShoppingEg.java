package Day_6;

public class ShoppingEg {
    public static void main(String[] args){
        double price = 1000;
        int quantity = 3;

        double total = price * quantity;
       // System.out.println(total);  output will be 3000.0

        // we have to give 200 discount

        double discount = 200;
        total -= discount;

        System.out.println("Final Price : $"+total);
    }
}
