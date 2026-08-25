class Solution {
    public int missingMultiple(int[] nums, int k) {
        int ans = k;
        while (true) {
            boolean found = false;
            for (int num : nums) {
                if (num == ans) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return ans;
            }
            ans += k;
        }
    }
}