class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1){
            return s.length();
        }
        HashMap<Character,Integer> mp = new HashMap<>();
        int ans=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                i=mp.get(s.charAt(i));
                if(count>ans) ans=count;
                count=0;
                mp.clear();
            }
            else{
                mp.put(s.charAt(i),i);
                count++;
            }
        }
        if(count>ans) ans=count;
        return ans;
    }
}
