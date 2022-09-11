public class Anagrams {
    static boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        int[] arr1 = new int[26];
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i<s1.length(); i++){
            arr1[s1.charAt(i) - 'a']++;
        }
        int count = 0;
        for(int i = 0; i<s1.length(); i++){
            if(arr1[s2.charAt(i)-'a'] > 0){
                arr1[s2.charAt(i)-'a']--;
            }else{
                count++;
                if(count > k){
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args){
        System.out.println(areKAnagrams("fodr","gork", 2));
    }
}
