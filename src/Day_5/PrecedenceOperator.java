package Day_5;

class PrecedenceOperator {
    public static void main(String[] args){
        int result = 10+5*2;// 10+(5*2) = 20       not (10+5)*2 = 30
        System.out.println(result);

        // precedence order
        //        ()
        //        ++
        //        --
        //        !
        //        *
        //        /
        //        %
        //        +
        //        -
        //        <
        //        >
        //        <=
        //        >=
        //        ==
        //        !=
        //        &&
        //        ||
        //        ?:
        //        =


        // When in doubt, use parentheses:

        int result1 = (10 + 5) * 2;
        System.out.println(result1);


    }
}
