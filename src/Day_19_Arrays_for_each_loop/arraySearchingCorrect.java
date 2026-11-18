package Day_19_Arrays_for_each_loop;

public class arraySearchingCorrect {
    public static void main(String[]args){
        int [] num = {10,20,33,45,55,59,65};
        int tar = 33;
        boolean found = false;
        for (int i=0;i<num.length;i++){
            if (tar == num[i]){
                System.out.println("index found at : "+i);
                found= true;
                break;
            }
        }
        if (!found){
            System.out.println("Index not found .. ");
        }

    }
}
