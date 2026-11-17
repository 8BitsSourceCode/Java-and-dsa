package PracticeQna;

public class maxInArray {
    public static void main(String[]args){
        int [] num = {53,23,98,34,47,32,665,57,83};
        int max = num[0];

        for (int i=0;i<num.length;i++){
            if (max < num[i]){
                max = num[i];
                System.out.println(max+" and this is index of array "+ i);

            }
        }
    }
}
