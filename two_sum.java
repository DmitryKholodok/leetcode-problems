# Two Sum
#Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
#You may assume that each input would have exactly one solution, and you may not use the same element twice.
#You can return the answer in any order.

#Input: nums = [2,7,11,15], target = 9
#Output: [0,1]
#Output: Because nums[0] + nums[1] == 9, we return [0, 1].

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for(int curr_index = 0; curr_index < nums.length; curr_index++) {
            int diff = target - nums[curr_index];
            Integer indexOfDiff = valueToIndex.get(diff);
            if (indexOfDiff == null) {
                valueToIndex.put(nums[curr_index], curr_index);
            } else {
                return new int[] {indexOfDiff, curr_index};
            }
        }

        throw new IllegalArgumentException();
    }
}

