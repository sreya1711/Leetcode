bool isValid(char* s) {
    int top=-1;
    int n=strlen(s);
    int stack[n];
    for(int i=0;i<n;i++)
    {
        char c=s[i];
        if(c=='(' || c=='{' || c=='[')
        {
            stack[++top]=c;
        }
        else
        {
            if(top==-1)
            return false;
            char last=stack[top--];
            if((c==')' && last!='(') || (c=='}' && last!='{') || (c==']' && last!='['))
            {
                return false;
            }
        }
    }
    return top==-1;
}