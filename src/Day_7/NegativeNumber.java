package Day_7;

public class NegativeNumber {
    public static void main(String[] args){
        int num = -66;
        if(num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Positive");
        }

        int marks = 39;
        if (marks >= 40){
            System.out.println("Pass");

        }else {
            System.out.println("Fail");

        }

            marks = 45;

            if (marks >= 90 && marks <= 100) {
                System.out.println("A");
            } else if (marks >= 80) {
                System.out.println("B");
            } else if (marks >= 70) {
                System.out.println("C");
            } else if (marks >= 60) {
                System.out.println("D");
            } else if (marks >= 0) {
                System.out.println("F");
            } else {
                System.out.println("Invalid marks");
            }
}}
