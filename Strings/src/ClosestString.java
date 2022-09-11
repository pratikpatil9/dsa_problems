import java.util.ArrayList;
import java.util.Arrays;

public class ClosestString {
    static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int s1 = -1;
        int s2 = -1;
        int mindis =0;
        for(int i = 0; i < s.size(); i++){
            if(s.get(i).equals(word1)){
                s1 = i;
            }
            if(s.get(i).equals(word2)){
                s2 = i;
            }
            if(s1 != -1 && s2 != -1){
                if(mindis == 0){
                    mindis = Math.abs(s2-s1);
                }else {
                    mindis = Math.min(mindis, Math.abs(s2 - s1));
                }
            }

        }
        return mindis;
    }
    public static void main(String[] args){

//        System.out.println(shortestDistance(new ArrayList<>(Arrays.asList("the", "quick", "brown","fox","quick")),"fox","the" ));
        System.out.println( 8 - '1');
    }
}
