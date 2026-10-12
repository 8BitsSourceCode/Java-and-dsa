package Day_6;

public class ShoppingEg2 {
    public static void main(String[] args){
        double purchaseAmount = 7000;
        boolean isMember = true;
        boolean eligibleForDiscount = purchaseAmount >= 5000 && isMember;

        System.out.println(eligibleForDiscount);
        double Discount = 300;
        purchaseAmount -= Discount;
        System.out.println("The Final Price is $"+purchaseAmount);
    }
}
