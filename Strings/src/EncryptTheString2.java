import java.util.HashMap;
import java.util.Map;

public class EncryptTheString2 {
    static String encryptString(String S){
        // code here
        String ans = "";
        Character curr = S.charAt(S.length()-1);
        int count = 1;
        for(int i = S.length() -2; i>=0; i--){
            if(curr == S.charAt(i)){
                count++;
            }else{
                ans = ans + Integer.toHexString(count)+curr;
                count = 1;
                curr = S.charAt(i);
            }
        }
        ans = ans+Integer.toHexString(count)+curr;
        return ans;
    }
//    static String hexaDecimal(int a){
//        StringBuilder ans = new StringBuilder();
//        String hexa = "";
//        int r = 0;
//        while(a != 0){
//            r = a % 16;
//            a = a/ 16;
//            if(r > 9){
//                hexa = "" +(char)(87 + r);
//            }else{
//                hexa = ""+ r;
//            }
//            ans.append(hexa);
//        }
//        ans.reverse();
//        return ans.toString();
//    }

    public static void main(String[] args){
        System.out.println(encryptString("aaaaaa"));
    }
}
