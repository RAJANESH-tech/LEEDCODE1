class Solution {
    public String firstPalindrome(String[] words) {
        String a="";
        for(int i=0;i<words.length;i++)
        {
            String b=words[i];
            String c="";
            for(int j=b.length()-1;j>=0;j--)
            {
                c+=b.charAt(j);
            }
            if(c.equals(b))
            {
                return c;
            }
        }
        return a;
    }
}