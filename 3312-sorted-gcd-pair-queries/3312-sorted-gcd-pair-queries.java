class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max=0;
        for(int x:nums){
            max=Math.max(max,x);

        }
        int[] freq=new int[max+1];
        for(int x:nums){
            freq[x]++;
        }
        long[] exact=new long[max+1];
        for(int d=max;d>=1;d--){
            long count=0;
            for(int multiple=d;multiple<=max;multiple+=d){
                count+=freq[multiple];
            }
            long pairs=count*(count-1)/2;
            for(int multiple=d*2;multiple<=max;multiple+=d){
                pairs-=exact[multiple];
            }
            exact[d]=pairs;
        }
        long[] prefix=new long[max+1];
        for(int i=1;i<=max;i++){
            prefix[i]=prefix[i-1]+exact[i];
        }
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            long target=queries[i]+1;
            int left=1;
            int right=max;
            while(left<right){
                int mid=left+(right-left)/2;
                if(prefix[mid]>=target){
                    right=mid;
                }
                else
                {
                    left=mid+1;
                }
            }
            ans[i]=left;
        }
        return ans;
    }
}