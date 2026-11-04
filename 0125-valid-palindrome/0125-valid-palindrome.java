class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
        if(Character.isLetterOrDigit(ch[i])){
        s1=s1+Character.toLowerCase(ch[i]);
        }
        }
        char ch1[]=s1.toCharArray();
        int left=0;
        int right=ch1.length-1;
        while(left<right){
            char temp=ch1[left];
            ch1[left]=ch1[right];
            ch1[right]=temp;
            left++;
            right--;

        }
       String s2=new String(ch1);
        if(s2.equals(s1))
        return true;
        else
        return false;
    }
}