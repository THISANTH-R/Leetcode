class Solution {
    public void manacherAlgo(int[] p,char[] t,int n){
        int center=0,right=0;
        for(int i=1;i<n-1;i++){
            int mirror=2*center-i;

            
            if(i<right){
                p[i]=Math.min(right-i,p[mirror]);
            }

            
            while(t[i+(1+p[i])]==t[i-(1+p[i])]){
                p[i]++;
            }

        
            if(i+p[i]>right){
                center=i;
                right=i+p[i];
            }
        }
    }
    public String longestPalindrome(String s) {
        if(s.length()==0) return "";

        
        StringBuilder t=new StringBuilder("^");
        for(char c:s.toCharArray()){
            t.append("#").append(c);
        }
        t.append("#$");

        char[] tarr=t.toString().toCharArray();
        int n=t.length();
        
        int[] p=new int[n];

        manacherAlgo(p,tarr,n); 

        int maxLen=0,centerInd=0;
        for(int i=1;i<n-1;i++){
            if(p[i]>maxLen){
                maxLen=p[i];
                centerInd=i;
            }
        }
        int start=(centerInd-maxLen)/2;
        return s.substring(start,start+maxLen);
    }
}
    
