class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        {
            return false;
        }
        int n=s1.length();
        int []a=new int [26];
        for(int i=0;i<s1.length();i++)
        {
            a[s1.charAt(i)-'a']++;
            a[s2.charAt(i)-'a']--;
        }
        boolean x=true;
        for(int i=0;i<26;i++)
        {
            if(a[i]!=0)
            {
                x=false;
            }
        }
        if(x)
        {
            return true;
        }
        for(int i=n;i<s2.length();i++)
        {
            a[s2.charAt(i-n)-'a']++;
            a[s2.charAt(i)-'a']--;
            boolean y=true;
            for(int j=0;j<26;j++)
            {
                if(a[j]!=0)
                {
                    y=false;
                }
            }
            if(y)
            {
                return true;
            }
        }
        return false;
    }
}