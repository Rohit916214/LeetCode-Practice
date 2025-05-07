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