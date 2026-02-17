public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(2, null, null);
    root.left = new TreeNode<>(1, null, null);
    root.left.left = new TreeNode<>(7, null, null);
    root.left.right = new TreeNode<>(4, null, null);

    root.right = new TreeNode<>(3, null, null);
    root.right.left = new TreeNode<>(5, null, null);
    root.right.right = new TreeNode<>(6, null, null);
    root.right.right = new TreeNode<>(9, null, null);
    root.right.right.right  = new TreeNode<>(8, null, null);

    TreeNode<String> stringRoot = new TreeNode<>("hello",null,null);
    stringRoot.left = new TreeNode<>("how", null, null);
    stringRoot.left.left = new TreeNode<>("are", null, null);
    stringRoot.left.right = new TreeNode<>("you", null, null);

    stringRoot.right = new TreeNode<>("I", null, null);
    stringRoot.right.left = new TreeNode<>("am", null, null);
    stringRoot.right.right = new TreeNode<>("so", null, null);
    stringRoot.right.right.right = new TreeNode<>("good", null, null);

    printGreater(root);
  }

  public static int countNodes(TreeNode<?> node){
   return node == null ? 0 : 1 + countNodes(node.left) + countNodes(node.right);
  }

  public static void printGreater(TreeNode<Integer> node, int threshold){
    if(node == null) return;
    if(node.value > threshold){
        System.out.println(node.value);

    }
    printGreater(node.left,threshold);
    printGreater(node.right,threshold);
  }

  public static void preorder(TreeNode<Integer> node){
    if(node == null) return;
        System.out.println(node.value);
    preorder(node.left);
    preorder(node.right);
  }

  public static <T> void inorder(TreeNode<T> node){
    if(node == null) return;
    inorder(node.left);
    System.out.print(node.value + " ");
    inorder(node.right);
  }

  public static <E> void postorder(TreeNode<E> node){
    if(node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.value + " ");

  }
}
