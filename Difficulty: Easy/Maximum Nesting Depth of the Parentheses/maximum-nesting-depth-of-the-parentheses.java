class Solution {
    
    public static int maxDepth(String s){
        int maxDepth=0;
        int currentDepth=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                currentDepth++;
                maxDepth=Math.max(currentDepth,maxDepth);
            }
            else if(ch==')'){
                currentDepth --;
            }
            
        }
        return maxDepth;

    }
}
