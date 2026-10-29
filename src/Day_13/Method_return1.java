package Day_13;

public class Method_return1 {
    // for total
    static int calculateTotal(int math, int java, int english){
        return math+java+english;
    }
    // for average
    static double Average(int total, int sub){
        return (double) total / sub;
    }
    public static void main(String[]args){
        // for total
        int total = calculateTotal(77,89,92);
        System.out.println(total);
        // for average
        double average = Average(total, 3);
        System.out.println(average);
        int avg = total/3;
        System.out.println(avg);
    }
}
