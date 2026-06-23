class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char[] a=s.toCharArray();
        while(i<j)
        { 
            if(Character.isLetter(a[i]) && Character.isLetter(a[j]))
            {
                char t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;
                j--;
            }
            else if(Character.isLetter(a[i]) && !Character.isLetter(a[j]))
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        String c=String.valueOf(a);
        return c;
    }
}