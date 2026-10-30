package Day_13;

public class method_scope {
    static void test(){
        int x = 10;
        System.out.println(x);


    }
//        public static void main(String[] args){
//        System.out.println(x);   we cannot do this because x belongs to test scope
//        }

//            Think:
//            test()
//            ┌─────────────────────┐
//            │ x = 10              │
//            │                     │
//            │ x exists here       │
//            └─────────────────────┘
//
//            main()
//            ┌─────────────────────┐
//            │ x doesn't exist     │
//            └─────────────────────┘
//            This is called scope

}
