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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<Object[]> queue = new ArrayDeque<>();
        List<int[]> nodes = new ArrayList<>();

        queue.offer(new Object[]{root, 0, 0});

        while (!queue.isEmpty()) {
            Object[] curr = queue.poll();

            TreeNode node = (TreeNode) curr[0];
            int row = (int) curr[1];
            int col = (int) curr[2];

            nodes.add(new int[]{col, row, node.val});

            if (node.left != null) {
                queue.offer(new Object[]{
                    node.left, row + 1, col - 1
                });
            }

            if (node.right != null) {
                queue.offer(new Object[]{
                    node.right, row + 1, col + 1
                });
            }
        }

        Collections.sort(nodes, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }

            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }

            return Integer.compare(a[2], b[2]);
        });

        int prevCol = Integer.MIN_VALUE;

        for (int[] node : nodes) {
            int col = node[0];
            int val = node[2];

            if (col != prevCol) {
                ans.add(new ArrayList<>());
                prevCol = col;
            }

            ans.get(ans.size() - 1).add(val);
        }

        return ans;
    }
}