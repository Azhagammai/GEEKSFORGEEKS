class Solution {
    public String reverse(String s) {
       int left=0;
       int right=s.length()-1;
       char ch[]=s.toCharArray();
       while(left<right){
           char temp=ch[left];
           ch[left]=ch[right];
            ch[right]=temp;
           left++;
           right--;
       }
       return new String(ch);
        
    }
}