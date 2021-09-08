/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
    public TreeNode bstFromPreorder(int[] preorder) {
    
        TreeNode root = new TreeNode(preorder[0]);

        for(int i=1; i< preorder.length; i++){
            preorderTraversal(root,preorder[i]);
        }
        return root;
        
    }
    
    public void preorderTraversal(TreeNode root,int val){
        
        while(root != null){
            if(val < root.val && root.left != null){
                root = root.left;
            } else if(val < root.val && root.left == null){
                root.left = new TreeNode(val);
                return;
            } else if(val > root.val && root.right != null){
                root = root.right;
            } else if(val > root.val && root.right == null){
                root.right = new TreeNode(val);
                return;
            }
        }
        
    }
    
}
