package Day_12;

public class method_condition {
    static boolean isAdult(int age){
        return age >= 18;
    }
    public static void main(String[]age){
        boolean result = isAdult(20);
        System.out.println(result);
        if(isAdult(19)){
            System.out.println("Major");
        }
    }
}
