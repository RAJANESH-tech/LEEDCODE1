class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3)
        {
            return 0;
        }
        int c=0,v=0;
        int k=3;
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<3;i++)
        {
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            if(m.get(s.charAt(i))>1)
            {
                c=1;
            }
        }
        if(c==0)
        {
            v++;
        }
        for(int i=k;i<s.length();i++)
        {
            c=0;
            m.put(s.charAt(i-k),m.get(s.charAt(i-k))-1);
            if(m.get(s.charAt(i-k))==0)
            {
                m.remove(s.charAt(i-k));
            }
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            if(m.size()!=3)
            {
                c=1;
            }
            if(c==0)
            {
                v++;
            }
        }
        return v;
    }
}