package PW.Practice.Lecture_16;

import java.util.Scanner;

// Find the total number of pairs in the Array whose sum is equal to the given value x {4,6,3,5,8,2} target=7
public class pair_sum {
    static int pairsum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {   //first number
            for (int j = i + 1; j < n; j++) {  // second number
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter"+n+"element");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum");
        int target = sc.nextInt();
        System.out.println(pairsum(arr,target));
    }
}
