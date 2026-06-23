class Solution {
    public String reverseWords(String s) {
        String[] a=s.trim().split("\\s+");
        String c="";
        for(int i=a.length-1;i>=0;i--)
        {
           c+=a[i];
           if(i>0)
           {
                c+=' ';
           }
        }
        return c;
    }
}