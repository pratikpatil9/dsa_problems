import java.util.ArrayList;
import java.util.Collections;

public class Factorial {
    static void multiply(ArrayList<Integer> result, int curEle){
        int carry = 0;
        for(int i = 0; i < result.size(); i++){
            int prod = result.get(i)*curEle + carry;
            result.set(i,prod%10);
            carry = prod/10;
        }
        while(carry != 0){
            result.add(carry%10);
            carry = carry/10;
        }
    }

    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> result = new ArrayList<>();

        result.add(1);
        for(int i = 2; i <= N; i++){
            multiply(result,i);
            System.out.println(result.size());
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args){
        System.out.println(factorial(5));
    }




}
