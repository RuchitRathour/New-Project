package Operator.Relational;

import java.util.Scanner;

public class Re1 {
    public static void main(String[] args) {
        //int a = 4,b = 5;
        int a,b;
        System.out.println("Enter tow number");
        Scanner re=new Scanner(System.in);
        a=re.nextInt();
        b=re.nextInt();
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}
