// User function template for Java

class Solution {
    static String conRevstr(String s1, String s2) {
        String r="";
        for(int i=s2.length()-1;i>=0;i--){
            r+=s2.charAt(i);
        }
        for(int i=s1.length()-1;i>=0;i--){
            r+=s1.charAt(i);
        }
        return r;
        

    }
}