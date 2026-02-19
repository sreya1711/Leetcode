class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int []da=new int[2*n];
        for(int i=0;i<n;i++)da[i+n]=da[i]=nums[i];
        int res[]=new int[n];
        Arrays.fill(res,-1);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<2*n;j++)
            {
                if(da[j]>nums[i])
                {
                    res[i]=da[j];
                    break;
                }
            }
        }
        return res;
    }
}