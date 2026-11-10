package Day_18_Arrays;

import javax.sound.midi.Soundbank;

public class Array_string_loop {
    public static void main(String[]args){
        String [] names = {"rohit","sandeep","jack", "bot","alice"};
        System.out.println(names[0]);

        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        System.out.println("In reverse format");

        for (int i=names.length-1;i>=0;i--){
            System.out.println(names[i]);
        }

    }
}
