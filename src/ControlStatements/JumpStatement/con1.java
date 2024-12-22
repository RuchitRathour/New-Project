package ControlStatements.JumpStatement;

public class con1 {
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            if(i==2){
                continue;//skip
            }
            System.out.println(i);
        }
    }
}
