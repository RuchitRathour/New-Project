package Kunal.Method;

import java.util.Scanner;

public class
L1 {
    public static void main(String[] args) {
        // Q: Take input of 2 number and print sum
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter Number 2 : ");
        int num2 = in.nextInt();
        System.out.println("Sum of two Number : ");
        int sum = num1+num2;
        System.out.println(sum);
    }
}
