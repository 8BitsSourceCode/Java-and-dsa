package Day_7;
import java.util.*;
public class Atm {
    public static void main(String[] args){
        Scanner take = new Scanner(System.in);
        double Balance = 37000;
        System.out.print("Enter the amount to Withdraw : ");
        double withdraw = take.nextDouble();

        if (withdraw <= Balance ){
            Balance -= withdraw;
            System.out.println("Withdraw Successful ");
            System.out.println("Remaining Balance : $" +Balance);
        }else{
            System.out.println("Balance Insufficient");
        }

    }
}
