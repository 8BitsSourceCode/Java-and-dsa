package Day_1;
import java.util.*;
public class Arrays {
    public static void main(String[] args){
        String [] arr  = new String[6];
        arr[0]="apple";
        arr[1]="ball";
        arr[5]="clog";

        System.out.println(arr[0]);

        int [] arr1 = new int[]{23,56,89,12,0,23};
        System.out.println(arr1.length);
        System.out.println(java.util.Arrays.stream(arr1).max());
        System.out.println(arr1[1]);





        }


    }

