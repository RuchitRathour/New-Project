package Operator.Shift;

public class both {
    public static void main(String[] args) {
        int x = 10,y = -10;
        // on +ve number
        System.out.println(x<<2);//left shift
        System.out.println(x>>2);//right shift
        System.out.println(x>>>2);//zero fill right shift

        // on -ve number
        System.out.println(y<<2);
        System.out.println(y>>2);
        System.out.println(y>>>2);

    }
}
