class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i < j){
           char left = s.charAt(i);
           char right = s.charAt(j);
           if(!((left >= 'a' && left <= 'z') || (left >= 'A' && left <= 'Z') || (left >= '0' && left <= '9')  )){
            i++;
           }else if(!((right >= 'a' && right <= 'z') || (right >= 'A' && right <= 'Z') || (right >= '0' && right <= '9')  )){
            j--;
           }else{
            if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                return false;
            }else{
                i++;
           j--;
            }
           }
           
           
        }
        return true;
    }
}