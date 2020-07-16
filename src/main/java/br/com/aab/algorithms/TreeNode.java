package br.com.aab.algorithms;

public class TreeNode {

  private int data;
  private TreeNode leftChild;
  private TreeNode rightChild;

  public void insert(int value) {
    if (value == data) return;

    if (value < data) {
      if (this.leftChild == null) {
        leftChild = new TreeNode(value);
      } else {
        leftChild.insert(value);
      }
    } else {
      if (this.rightChild == null) {
        this.rightChild = new TreeNode(value);
      } else {
        this.rightChild.insert(value);
      }
    }
  }

  public void traverInOrder() {
    if (leftChild != null) {
      leftChild.traverInOrder();
    }
    System.out.print(data + ", ");
    if (rightChild != null) {
      rightChild.traverInOrder();
    }
  }

  public TreeNode(int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public TreeNode getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(TreeNode leftChild) {
    this.leftChild = leftChild;
  }

  public TreeNode getRightChild() {
    return rightChild;
  }

  public void setRightChild(TreeNode rightChild) {
    this.rightChild = rightChild;
  }
}
