public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(2, null, null);
    root.right = new TreeNode(1, null, null);
    root.right.left = new TreeNode(7, null, null);
    root.right.left.left = new TreeNode(4, null, null);
    root.right.left.left.left = new TreeNode(3, null, null);
    root.right.left.left.right = new TreeNode(5, null, null);
    root.right.right = new TreeNode(6, null, null);
    root.right.right.right = new TreeNode(9, null, null);
    root.right.right.right.left = new TreeNode(8, null, null);

    inorder(root);
  }

  public static void preorder(TreeNode node){
    if(node == null) return;
    System.out.println(node.value);
    preorder(node.left);
    preorder(node.right);
  }

  public static void inorder(TreeNode node){
    if(node == null) return;
    inorder(node.left);
    System.out.print(node.value + " ");
    inorder(node.right);
  }

  public static void postorder(TreeNode node){
    if(node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.value + " ");

  }
}
