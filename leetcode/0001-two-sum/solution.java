class Solution {
    public static int[] twoSum(int[] nums, int target) {
        // HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // the other number needed
            
            if (map.containsKey(complement)) {
                // found the pair
                return new int[] { map.get(complement), i };
            }
            
            // store current number with index
            map.put(nums[i], i);
        }
        
        // if no solution found (though problem guarantees one)
        throw new IllegalArgumentException("No two sum solution");
    }

        
    
}
