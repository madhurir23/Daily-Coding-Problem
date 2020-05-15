package Helper;

public class TreeNode {
    Integer data;
    TreeNode left;
    TreeNode right;

    public TreeNode(Integer val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }

    public TreeNode addLeftChild(Integer val) {
        this.left = new TreeNode(val);
        return this.left;
    }

    public TreeNode addRightChild(Integer val) {
        this.right = new TreeNode(val);
        return this.right;
    }
}
