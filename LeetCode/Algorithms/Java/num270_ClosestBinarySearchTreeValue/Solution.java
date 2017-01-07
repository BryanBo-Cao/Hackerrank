package num270_ClosestBinarySearchTreeValue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int closestValue(TreeNode root, double target) {
        int closestVal = root.val;   
        while (root != null){
            if (Math.abs(target - root.val) < Math.abs(target - closestVal)) closestVal = root.val;
            root = root.val > target ? root.left : root.right;
        }     
        return closestVal;
    }
}

//https://leetcode.com/problems/closest-binary-search-tree-value/
/*
270. Closest Binary Search Tree Value   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 26226
Total Submissions: 68966
Difficulty: Easy
Contributors: Admin
Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.

Note:
Given target value is a floating point.
You are guaranteed to have only one unique value in the BST that is closest to the target.
*/
//From https://discuss.leetcode.com/topic/25219/clean-and-concise-java-solution
//From https://discuss.leetcode.com/user/larrywang2014