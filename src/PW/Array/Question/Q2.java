package PW.Array.Question;
// Question-> calculate maximum element in array
public class Q2 {
    public static void main(String[] args) {
        int[] array = {5,3,6,2,8,1};
        int ans = 0;
        for(int i=0;i< array.length;i++)
        {
            if(array[i]>ans)
            {
                ans = array[i];
            }
        }
        System.out.println("Max="+ans);
    }
}
