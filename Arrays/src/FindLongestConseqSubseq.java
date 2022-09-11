import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindLongestConseqSubseq {
    static int findLongestConseqSubseq(int arr[], int N)
    {
        // add your code here
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< N; i++){
            set.add(arr[i]);
        }
        int longest = 0;
        int length = 0;
        for(int i = 0; i < N; i++){
            if(set.contains(arr[i] - 1) == false){
                length = 0;
                while(set.contains(arr[i] + length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }

        }
        return longest;
    }

    class Node
    {
        int data;
        Node next,prev;

        Node(int x){
            data = x;
            next = null;
            prev = null;
        }
    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Node node = head;
        while(node != null){
            int d = target - node.data;
            if(!set.contains(d)){
                set.add(d);
            }else{
                ans.add(new ArrayList<Integer>(
                        Arrays.asList(d,node.data)));
            }
            node = node.next;
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(convertToRoman(5));
    }
}
