/**
 * 11. 盛最多水的容器
 *
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点(i,ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i的两个端点分别为(i,ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 */
public class Solution0011 {
    /**
     * 利用双指针，初始化在左右两端，每次移动较短的那个边的指针。
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int S = (height.length - 1) * Math.min(height[0],height[height.length - 1]);
        int i = 0, j = height.length - 1;
        while (i < j) {
            int s = (j - i) * Math.min(height[i], height[j]);
            if ( s > S) {
                S = s;
            }
            if (height[i] < height[j]){
                i++;
            } else {
                j--;
            }
        }
        return S;
    }
}
