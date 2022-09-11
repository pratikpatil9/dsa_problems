import java.util.HashSet;

public class GetPairCount {
    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        int d = 0;
        int count = 0;
        for(int i =0; i < n ; i++){
            d = k - arr[i];
            if(set.contains(d)){
                count++;
            }
            set.add(arr[i]);
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,5,7,1};
        System.out.println(getPairsCount(arr,4, 6));
    }
}
