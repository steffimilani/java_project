class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int lsum=0;
        for(int i=0;i<nums.length;i++){

            int rsum=0;
            rsum=totalsum-nums[i]-lsum;
            if(rsum==lsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;

    }
}