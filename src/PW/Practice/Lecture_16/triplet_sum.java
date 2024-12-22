package PW.Practice.Lecture_16;

import java.util.Scanner;
// Count the number of triplets whose sum is equal to the given value x {1,4,5,6,3} target=12
public class triplet_sum {
    static int pairsum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {   //first number
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
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

        System.out.println("Enter" + n + "element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum");
        int target = sc.nextInt();
        System.out.println(pairsum(arr, target));
    }
}