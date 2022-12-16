/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = Integer.MIN_VALUE;
        int area = 0;
        while(left < right){
            if(height[left]<height[right]){
                area = (right-left) *height[left];
                left++;
            }else{
                area = (right-left) *height[right];
                right--;
            }
            max = Math.max(max, area);
            
        }
        
        return max;

    }
}
// @lc code=end

