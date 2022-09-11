import java.util.HashMap;

public class CountSubArrayZeroOne {
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        if(n == 1){
            return 0;
        }
        int count = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                sum -= 1;
            }else{
                sum += 1;
            }
            if(map.containsKey(sum)){
                count += map.get(sum);
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        return count;
    }
    public static void main(String[] args){

        System.out.println(countSubarrWithEqualZeroAndOne(new int[] {1,1,1,0},4));
    }
}

