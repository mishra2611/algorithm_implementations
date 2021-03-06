/*

 Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.

Formally the function should:

    Return true if there exists i, j, k
    such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false. 

Your algorithm should run in O(n) time complexity and O(1) space complexity.

Examples:
Given [1, 2, 3, 4, 5],
return true.

Given [5, 4, 3, 2, 1],
return false. 

*/


class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3)
            return false;
        int max=Integer.MAX_VALUE, min=Integer.MAX_VALUE;
        for(int i:nums)
        {
            if(i<=min)
                min=i;
            else if(i<=max)
                max=i;
            else
                return true;
        }
        return false;
    }
    
    
}
