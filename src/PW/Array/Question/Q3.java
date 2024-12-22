package PW.Array.Question;
// Question-> Given array {4,2,5,8,6} and given x=5 and find out index of x and x is present in array
// x not present in array return -1
public class Q3 {
    public static void main(String[] args) {
        int [] array = {4,2,5,8,6};
                int x = 5;
        int ans = -1;
        for(int i=0;i< array.length;i++)
        {
            if(array[i]==x)
            {
                ans = i;
            }
        }
        System.out.println("Found"+x+"at index"+ans);
    }
}
