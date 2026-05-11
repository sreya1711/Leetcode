class Solution {
    public int[] separateDigits(int[] nums) {
        String s="";
        for(int num:nums){
            s+=num;
        }
        int[] ans=new int[s.length()];
        for(int i=0;i<s.length();i++){
            ans[i]=s.charAt(i)-'0';
        }
        return ans;
    }
}