import java.util.ArrayList;
import java.util.HashSet;

public class SubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int f = 0;
        int sum = 0;
        for(int l = 0; l < arr.length; l++){
            sum += arr[l];
            while(sum > s){
                sum -= arr[f];
                f++;
            }
            if(sum == s){
                ans.add(f);
                ans.add(l);
                return ans;
            }

        }
        ans.add(-1);
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {135,101, 170, 125 ,79 ,159, 163 ,65 ,106, 146 ,82 ,28 ,162, 92, 196, 143, 28, 37, 192, 5, 103 ,154, 93, 183 ,22 ,117, 119 ,96 ,48 ,127, 172 ,139 ,70, 113, 68, 100 ,36 ,95 ,104, 12 ,123 ,134};
        System.out.println(subarraySum(arr,42,468));
    }
}
