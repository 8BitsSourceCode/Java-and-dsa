package Day_20;

public class arrayStudentMarks {
    public static void main(String[]args){
        int[] marks = {78, 92, 65, 88, 55, 90,39};

        int total = 0;
        int avg = 0;
        int high = marks[0];
        int low = marks[0];
        int index = 0;
        int passed =0;
        for (int i=0;i<marks.length;i++){
            total += marks[i];
            if(high < marks[i]){
                high = marks[i];
                index = i;
            }
            if (marks[i] < low){
                low = marks[i];
                index =i;
            }
            if(marks[i]>=40){
                passed+=1;
            }
        }

        System.out.println("Total marks : "+total);
        System.out.println("Average marks : "+(total/marks.length));
        System.out.println("Highest value : "+ high);
        System.out.println("Lowest value : "+ low);
        System.out.println("Passed students : "+passed);
    }
}
