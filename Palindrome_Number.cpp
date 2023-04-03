#include<bits/stdc++.h>
class Solution {
public:
    bool isPalindrome(int x) {
        string ans=to_string(x);
        stack<int> st;
        for(int i=0;i<ans.length();i++)
        {
            st.push(ans[i]);
        }
        int i=0;
        while(!st.empty())
        {
            if(st.top()!=ans[i])
            {
                return false;
            }
            st.pop();
            i++;
        }
        return true;
    }
        
        
        
    
};
