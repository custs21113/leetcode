class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        int ans=0,n=s.length();
        for(int end=0,start=0;end<n;end++){
            char ch=s.charAt(end);
            if(map.containsKey(ch)){
                start=Math.max(map.get(ch),start);
            }
            ans=Math.max(ans,end-start+1);
            map.put(ch,end+1);
        }
        return ans;
    }
}
