public class DivisibleBy7 {
    static int isdivisible7(String num){

        int rem = 0;
        for(int i = 0; i < num.length(); i++){
//            rem = ((rem*10)+(num.charAt(i)-'0')) % 7;
            System.out.println(rem);
        }
        return rem==0?1:0;

    }
    public static void main(String[] args){
        System.out.println(isdivisible7("8955795758"));
    }
}
