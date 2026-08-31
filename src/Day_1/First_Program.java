package Day_1;
import java.util.*;

public class First_Program {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.print("Enter the A value : ");
        int a=sc.nextInt();
        System.out.print("Enter the B value : ");
        int b=sc.nextInt();

        int sum = (a+b);
        int sub = (a-b);
        int pro = (a*b);

        System.out.println("Options \n1.sum\n2.sub\n3.pro");

        int take=sc.nextInt();
        if (take == 1){
            System.out.println(sum);
        }
        else if (take == 2) {
            System.out.println(sub);
        }
        else{
        System.out.println(pro);

            }
        }

    }

