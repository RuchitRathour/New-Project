package ControlStatements.LoopStatement.WhileLoop;

import java.util.Scanner;

public class Wh2 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter value for condition");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        while (n>=0){
            System.out.println("Learn Coding");
        }
    }
}
