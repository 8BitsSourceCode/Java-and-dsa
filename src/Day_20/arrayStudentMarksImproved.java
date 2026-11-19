package Day_20;

public class arrayStudentMarksImproved {
    public static void main(String[]args){
        int[] marks = {78, 92, 65, 88, 55, 90, 39};
        final int passing_marks =40;

        if (marks.length == 0){
            System.out.println("No marks available.");
            return;
        }
        int total = 0;
        int high = marks[0];
        int low = marks[0];
        int passed = 0;

        for (int mark : marks){
            total += mark;

            if (mark > high){
                high = mark;
            }else if (mark < low){
                low = mark;
            }
            if (mark >= passing_marks){
                passed ++;
            }

        }
        double average = (double) total / marks.length;

        System.out.println("Total marks     : " + total);
        System.out.printf("Average marks   : %.2f%n", average);
        System.out.println("Highest value   : " + high);
        System.out.println("Lowest value    : " + low);
        System.out.println("Passed students : " + passed);
    }
}
