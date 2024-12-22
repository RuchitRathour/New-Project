package PW.Method;

import java.util.Scanner;

class Algebra{
    int Add(int a,int b) {
        int ans = a + b;
        return ans;
    }

}
public class C2 {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("sum of input Number is");
       int ans =  obj.Add(x,y);
        System.out.println(ans);
    }
}
