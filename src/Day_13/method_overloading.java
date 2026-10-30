package Day_13;

public class method_overloading {
//    Java allows multiple methods with the same name as long as their parameters are
//    different.
    static int add(int a , int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[]args){
        System.out.println(add(2,5)+" "+add(4,5,9));
        //  OR
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
    }
}
