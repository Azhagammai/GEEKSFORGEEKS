// User function Template for Java
class Solution {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       for(int num:arr){
           pq.add(num);
           
       }
       return pq;
       
        
    }
}