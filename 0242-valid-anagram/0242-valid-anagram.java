class Solution {
    public boolean isAnagram(String s, String t) {
        char []a=s.toCharArray();
        char []b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int c=0;
        for(int i=0;i<a.length && i<b.length;i++)
        {
            if(a[i]==b[i])
            {
                c++;
            }
        }
        if(c==a.length && c==b.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}