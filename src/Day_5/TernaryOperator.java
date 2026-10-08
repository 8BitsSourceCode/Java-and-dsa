package Day_5;

public class TernaryOperator {
    public static void main(String[] args){
        int age = 20;
        String result = age >= 18 ? "Adult" : "minor";
        System.out.println(result);

//        String Car = "Audi";
//        String brand = Car = "Audi" ? "best " : "wrost";          string cannot convert to boolean


        // same as

        String result1;

        if (age >= 18) {
            result1 = "Adult";
        } else {
            result1 = "Minor";
        }
        System.out.println(result1);

        // another example

        int a = 10;
        int b = 20;

        int max = a > b ? a: b;

        System.out.println(max);

    }
}
