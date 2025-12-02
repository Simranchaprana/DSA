class Solution {
    public int findMaxConsecutiveOnes(int[] nums){ 
        int c=0,i=0,j=0;
        while(j<nums.length){
            if (nums[j]==1){
                c=Math.max(c,j-i+1);
            }
            else{
               i=j+1;
            }
            j++;
        }
        return c;
    }
    
}
