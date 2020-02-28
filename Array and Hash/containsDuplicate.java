class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hash_set = new HashSet();
        
        if (nums.length == 0) return false;
        
        for (int i = 0; i < nums.length; i++) {
            if (hash_set.contains(nums[i]) == false) 
                hash_set.add(nums[i]);
            else return true;
        }
        return false;
    }
}



