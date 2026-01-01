int lengthOfLongestSubstring(char* s) {
    int freq[256]={0};
    int left=0,right=0;
    int maxLen=0;
    while(s[right]!='\0')
    {
        char c=s[right];
        freq[c]++;

        while(freq[c]>1)
        {
            freq[s[left]]--;
            left++;
        }
        int currlen=right-left+1;
        if(currlen>maxLen)
        {
            maxLen=currlen;
            
        }
        right++;
    }
    return maxLen;

}