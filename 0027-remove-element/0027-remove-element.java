class Solution {
    public int removeElement(int[] nums, int val) {
        int pt=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val){
               if(i !=pt){
                nums [pt]=nums[i];
               } 
               pt +=1;
            }
            }
            return pt;
        }
}