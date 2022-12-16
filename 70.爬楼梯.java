/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int[] res = new int[n+1];
        
        if(n<=2){
            return n;
        }
        res[0] = 0;
        res[1] = 1;
        res[2] = 2;
        for(int i=3;i<=n;i++){
            res[i] = res[i-1] + res[i-2];
        }
        return res[n];

    }
}
// @lc code=end

