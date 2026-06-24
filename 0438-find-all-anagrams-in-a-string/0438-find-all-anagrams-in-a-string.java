class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> b=new ArrayList<>();
        if(s.length()<p.length())
        {
            return b;
        }
        int []a=new int [26];
        int n=p.length();
        for(int i=0;i<n;i++)
        {
            a[p.charAt(i)-'a']++;
            a[s.charAt(i)-'a']--;
        }
        boolean x=true;
        for(int i=0;i<26;i++)
        {
            if(a[i]!=0)
            {
                x=false;
                break;
            }
        }
        if(x){
            b.add(0);
        }
        for(int i=n;i<s.length();i++)
        {
            a[s.charAt(i-n)-'a']++;
            a[s.charAt(i)-'a']--;
            boolean y=true;
            for(int j=0;j<26;j++)
            {
                if(a[j]!=0)
                {
                    y=false;
                    break;
                }
            }
            if(y)
            {
                b.add(i-n+1);
            }
        }
        return b;
    }
}