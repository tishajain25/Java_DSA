/* Container With Most Water leetcode #11  */

public class Container {
    public int maxArea(int[] height) {
        int maximumArea = Integer.MIN_VALUE;
        int left = 0;  
        int right = height.length - 1;
        while (left < right) {
            int shorterLine = Math.min(height[left], height[right]);
            maximumArea = Math.max(maximumArea, shorterLine * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maximumArea;
    }
}
