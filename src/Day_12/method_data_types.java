package Day_12;

public class method_data_types {
    //integer
    static int add(int a , int b){
        return a+b;
    }
    // decimal
    static double calAvg(double a,double b){
        return (a + b)/2;
    }
    // boolean
    static boolean isAdult(int age){
        return age >= 18;
    }
    // string
    static String greet(String name){
        return "Hell0 " + name ;
    }

    public static void main(String[]args){
        int resultAdd = add(32,77);
        double avg = calAvg(53 , 72);
        boolean age1 = isAdult(22);
        String name1 = greet("Jack");
        System.out.println(resultAdd);
        System.out.println(avg);
        System.out.println(age1);
        System.out.println(name1);


    }
}
