class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int m=0;
        HashSet<Character> a=new HashSet<>();
        while(r<s.length())
        {
            while(a.contains(s.charAt(r)))
            {
                a.remove(s.charAt(l));
                l++;
            }
            a.add(s.charAt(r));
            if(m<a.size())
            {
               m=a.size();
            }
            r++;
        }
        return m;
    }
}