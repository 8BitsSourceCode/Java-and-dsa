package Day_11;

public class Multiple_parameters_items1 {
    static void calculateTotal(double price, int quantity){
        double total = price * quantity;
        System.out.println("Total : $ "+total);

    }
    public static void main(String[]args){
        calculateTotal(50000,3);
        calculateTotal(4500, 2);
    }
}
