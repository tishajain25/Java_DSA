/* Container With Most Water leetcode #11

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of 
the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.

*/

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
