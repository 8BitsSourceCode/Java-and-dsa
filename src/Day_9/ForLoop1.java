package Day_9;

import com.sun.security.jgss.GSSUtil;

public class ForLoop1 {
    public static void main(String[]args){

        int sum = 0;
        for (int i=1;i<=5;i++){
            sum+=i;
        }
        System.out.println(sum);

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("10 to 1");
        for(int i=10;i>=1;i--){
            System.out.println(i);
        }
        System.out.println("1 to 20 even numbers ");
        for(int i = 1;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("1 to 20 odd numbers ");
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        System.out.println("Sum of n numbers ");
        sum =0;
        for (int i=1;i<=20;i++){
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("Multiplication table ");
         int  n = 21;
         for (int i=1;i<=10;i++){
             System.out.println(n+"x"+i+"="+(n*i));
         }


         }
    }

