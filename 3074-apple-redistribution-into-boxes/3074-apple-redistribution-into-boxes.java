class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples=0;
        for(int a:apple){
            totalApples+=a;
        }
        Arrays.sort(capacity);
        int box=0;
        int currcapacity=0;
        for(int i=capacity.length-1;i>=0;i--){
            currcapacity+=capacity[i];
            box++;
            if(currcapacity>=totalApples){
                return box;
            }
        }
        return box;
    }
}