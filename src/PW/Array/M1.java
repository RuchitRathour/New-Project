package PW.Array;

import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int [rows][cols];

        // rows
        for(int i=0;i<rows;i++){
             // colum
            for(int j=0;j<cols;j++)
            {
                numbers[i][j] = sc.nextInt();
            }
        }
        // output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }
}
