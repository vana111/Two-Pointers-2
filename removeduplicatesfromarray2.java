// tc - O(n)
// sc - O(1)
// ran in leetcode - yes
// leetoccde no - 80
class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums == null || nums.length == 0){
            return 0;
        }

        int  j = 1;
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count <=2 || nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j= j+1;
            }
        }
        return j;
    }
}