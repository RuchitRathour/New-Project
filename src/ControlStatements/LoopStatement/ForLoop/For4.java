package ControlStatements.LoopStatement.ForLoop;

public class For4 {
    public static void main(String[] args) {
        int counter = 0;
       aa: for(int i = 0; i<=10; i++){
           for(int j = 0; j<=10; j++){
               if(i==5)
                   break aa;
           }
           counter++;
        }
        System.out.println(counter);
    }
}
