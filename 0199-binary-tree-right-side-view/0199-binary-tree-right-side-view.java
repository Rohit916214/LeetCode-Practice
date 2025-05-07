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

// by using level order traversal


/*
class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){

            List<Integer> sub = new ArrayList<>();
            int size = q.size();

            for(int i = 0; i < size; i++){

                if(q.peek().left != null){
                    q.offer(q.peek().left);
                }

                if(q.peek().right != null){
                    q.offer(q.peek().right);
                }

                sub.add(q.poll().val);
            }

            int n = sub.size();

            ans.add(sub.get(n-1));

        }

        return ans;

        
    }
}

*/


// by using recursion


class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();
        Helper(root, ans, 0);
        return ans;
    }

    private void Helper(TreeNode root, ArrayList<Integer> ans, int currLevel){
        if(root == null){
            return;
        }

        if(currLevel == ans.size()){
            ans.add(root.val);
        }

        Helper(root.right, ans, currLevel + 1);
        Helper(root.left, ans, currLevel + 1);
    }
}