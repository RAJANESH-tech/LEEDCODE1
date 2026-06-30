class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        for(int i=0;i<k;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                c++;
            }
        }
        if(c==k)
        {
            return c;
        }
        int max=c;
        for(int i=k;i<s.length();i++)
        {
            char chr=s.charAt(i-k);
            char chs=s.charAt(i);
            if(chr=='a' || chr=='e' || chr=='i' || chr=='o' || chr=='u')
            {
                c--;
            }
            if(chs=='a' || chs=='e' || chs=='i' || chs=='o' || chs=='u')
            {
                c++;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}