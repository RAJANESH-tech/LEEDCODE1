class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        String st="";
        for(int i=s.length()-1;i>=0;i--)
        {
            st+=s.charAt(i);
        }
        if(s.equals(st))
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
        
    }
}