class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int left_sum=0;
        for(int i=0;i<n;i++){
            int right_sum=total-left_sum-nums[i];
            ans[i]=Math.abs(left_sum-right_sum);
            left_sum+=nums[i];
        }
        return ans;
    }
}