class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] pd=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            pd[i]=gcd(nums[i],max);
        }
        Arrays.sort(pd);
        long sum=0;
        int left=0;
        int right=n-1;
        while(left<right){
            sum+=gcd(pd[left],pd[right]);
            left++;
            right--;
        }return sum;
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}