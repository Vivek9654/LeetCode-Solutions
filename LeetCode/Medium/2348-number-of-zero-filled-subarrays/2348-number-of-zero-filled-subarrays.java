class Solution {
    public long zeroFilledSubarray(int[] nums) {
// this is very brute force approach
        
        int n = nums.length;
        long count = 0;
        long ans = 0;


        // int current = 0;
        // for (int i = 0; i < n; i++) {

        //     if (nums[i] == 0) {
        //         count++;
        //         current = count;
        //         ans += current;
        //     } else if (nums[i] != 0)
        //         count = 0;
        // }

        // return ans;


//now i will do using math formula

   for(int num:nums ){
    if(num==0) count++;
    else{
      ans += (count * (count + 1)) / 2;
        count=0;
    }
   }
    ans += (count * (count + 1)) / 2;
  return ans;
    }
}