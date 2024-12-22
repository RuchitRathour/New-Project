package Operator.Logical;

import java.sql.SQLOutput;

public class Lo1 {
    public static void main(String[] args) {
        int a = 10,b = 5, c = 20;
        // Logical && and Bitwise &
        System.out.println(a<b&&a<c);
        System.out.println(a<b&a<c);
        // Logical & and bitwise &
        System.out.println(a>b||a<c);
        System.out.println(a>b|a<c);
        // Logical !
        System.out.println(!(a>b||a<c));
        System.out.println(!(a>b|a<c));

    }
}
