public class IsomorphicStrings {
    //brute force solution
//    public static boolean areIsomorphic(String str1,String str2)
//    {
//        // Your code here
//        if(str1.length() != str2.length()){
//            return false;
//        }
//        for(int i = 0; i <str1.length(); i++){
//            for(int j = i; j <str1.length(); j++){
//                boolean bool1;
//                boolean bool2;
//                if(str1.charAt(j) == str1.charAt(i)){
//                    bool1 = true;
//                }else{
//                    bool1 = false;
//                }
//                if(str2.charAt(j) == str2.charAt(i)){
//                    bool2 = true;
//                }else{
//                    bool2 = false;
//                }
//                if(bool1 != bool2){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    //optimized solution

    static final int CHAR = 26;
    static boolean isoMorphic(String str1, String str2)
    {
        int n = str1.length();
        int m = str2.length();

        // Length of both strings must be
        // same for one to one
        // correspondence
        if (n != m)
            return false;

        // For counting the previous appearances
        // of character in both the strings
        int[] countChars1 = new int[CHAR];
        int[] countChars2 = new int[CHAR];

        // Process all characters one by one
        for (int i = 0; i < n; i++) {
            countChars1[str1.charAt(i) - 'a']++;
            countChars2[str2.charAt(i) - 'a']++;
        }
        // For string to be isomorphic the
        // previous counts of appearances of
        // current character in both string
        // must be same if it is not same we
        // return false.

        //before it was not working for the test case mentioned below(wrong output)
        // str1 = "aba" , str2 = "xyy"
        for(int i= 0; i < n; i++) {
            if (countChars1[str1.charAt(i) - 'a']
                    != countChars2[str2.charAt(i) - 'a']) {
                return false;
            }
        }
        return true;
    }
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length() != str2.length()){
            return false;
        }

        for(int i = 0; i <str1.length(); i++){

        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isoMorphic("aba", "xxy"));
    }
}
