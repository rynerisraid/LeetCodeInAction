import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numsMap = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            if(numsMap.containsKey(target-nums[i]) && numsMap.get(target-nums[i])!=i){
                return new int[] {i,numsMap.get(target-nums[i])};
            }else{
                numsMap.put(nums[i], i);
            }
        }

        return new int[]{};

    }
}
// @lc code=end

