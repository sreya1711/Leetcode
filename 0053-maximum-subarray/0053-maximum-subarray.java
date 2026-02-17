class Solution {
    public int maxSubArray(int[] nums) {
    int maxS=nums[0];
    int currS=nums[0];
    for(int i=1;i<nums.length;i++){
        if(currS<0){
            currS=0;
        }
        currS=currS+nums[i];
        if(currS>maxS){
            maxS=currS;
        }
    }
    return maxS;
    }
}