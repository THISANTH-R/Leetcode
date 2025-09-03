class Solution {
    public int climbStairs(int n) {
      if(n<=3) {
        return n;
      } 
      int p=3,q=2;
      int d;
      for(int i=3;i<n;i++){
         d=p+q;
         q=p;
         p=d;
      }
      return p;
    }
}