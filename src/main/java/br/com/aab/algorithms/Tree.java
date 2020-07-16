package br.com.aab.algorithms;

public class Tree {

  private TreeNode root;

  public void insert(int value) {
    if (this.root == null) {
      this.root = new TreeNode(value);
    } else {
      this.root.insert(value);
    }
  }

  public void traverseInOrder() {
    if (root != null) {
      root.traverInOrder();
    }
  }
}
