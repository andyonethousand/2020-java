class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash_table = new HashMap();
        
        for (int i = 0; i < nums.length; i++) {
            hash_table.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int number_to_get = target - nums[i];
            if (hash_table.containsKey(number_to_get) && hash_table.get(number_to_get) != i) {
                return new int[] {i, hash_table.get(number_to_get)};
            }
        } 
    throw new IllegalArgumentException("No two sum solution");
    }
}            
