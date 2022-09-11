public class SubArrayProduct {
    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        if(nums.length == 1){
            return maxProduct;
        }
        int currMin = 1;
        int currMax = 1;

        for(int i = 0; i < nums.length; i++){
            int temp = currMax * nums[i];
            currMax = Math.max(Math.max(currMin * nums[i], currMax * nums[i]), nums[i]);
            currMin = Math.min(Math.min(currMin * nums[i], temp), nums[i]);

            maxProduct = Math.max(maxProduct,currMax);
            if(nums[i] == 0){
                currMin = 1;
                currMax = 1;
            }

        }
        return maxProduct;
    }
    public static void main(String[] args){
        System.out.println(maxProduct(new int[] {3,12,15,23,33,-35,30,-40,-30,-30,-30,26,28}));
    }
}
