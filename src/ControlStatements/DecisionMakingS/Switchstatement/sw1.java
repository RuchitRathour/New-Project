package ControlStatements.DecisionMakingS.Switchstatement;

import java.util.Scanner;

public class sw1 {
    public static void main(String[] args) {
        int button;
        Scanner sc = new Scanner(System.in);
        button = sc.nextInt();
        if(button==1){
            System.out.println("Hellow");
        }
        else if(button==2){
            System.out.println("Nanaste");
        }
        else if(button==3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid button");
        }
    }
}
