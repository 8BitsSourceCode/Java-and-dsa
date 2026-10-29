package Day_13;

public class Method_return1 {
    static int calculateTotal(int math, int java, int english){
        return math+java+english;
    }
    public static void main(String[]args){
        int total = calculateTotal(77,89,92);
        int avg = total/3;
        System.out.println(total);
        System.out.println(avg);
    }
}
