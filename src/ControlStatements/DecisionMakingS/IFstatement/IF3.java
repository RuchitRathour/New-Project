package ControlStatements.DecisionMakingS.IFstatement;

public class IF3 {
    public static void main(String[] args) {
        int year = 2020;
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("comman year");
        }

    }
    }
