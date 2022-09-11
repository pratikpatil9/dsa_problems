import java.util.ArrayList;
import java.util.HashMap;

public class Duplicates {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                if(map.get(arr[i]) == 2) {
                    ans.add(arr[i]);
                }
            }else{
                map.put(arr[i],1);
            }
        }
        if(ans.size() == 0){
            ans.add(-1);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {13,9,25,1,1,0,22,13,22,20,3,8,11,25,10,3,15,11,19,20,2,4,25,14,23,14};
        System.out.println(duplicates(arr,26));
    }
}
