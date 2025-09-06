class Solution {
    public boolean containsDuplicate(int[] nums) {
        //sorting apporach   tc= O(nlogn)
        // Arrays.sort(nums);
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] == nums[i - 1])
        //         return true;
        // }
        // return false;

        //now hashmap with tc  O(n)

        HashSet <Integer> seen = new HashSet<>();
        for(int num:nums){
            if(!seen.add(num))return true ;

        }
        return false;
    }
}