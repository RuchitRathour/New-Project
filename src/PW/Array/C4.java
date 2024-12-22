package PW.Array;

import java.util.Scanner;
// input from user
public class C4 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter array size:");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array element ");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Array element ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
