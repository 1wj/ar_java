package com;

public class LinkedBinaryTreee implements BinaryTree{
    private Node root;

    public LinkedBinaryTreee() {
    }

    public LinkedBinaryTreee(Node root) {
        this.root = root;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public int size() {
        System.out.println("二叉树节点的个数");
        int o=this.size(root);
        return o;
    }
    private int size(Node node) {
        if(node!=null){
            //获取左子树的size
            int h1=this.size(node.leftChild);
            //获取右子树的高度
            int h2=this.size(node.rightChild);
            //返回左子树，右子树size之和并+1
            return h1+h2+1;
        }else {
            return 0;
        }

    }

    @Override
    public int getHeight() {
        System.out.println("二叉树的高度是");
        int i=this.getHeight(root);
        return i;
    }
    private int getHeight(Node node){

        if(node!=null){
            //获取左子树的高度
            int h1=this.getHeight(node.leftChild);
            //获取右子树的高度
            int h2=this.getHeight(node.rightChild);
            //返回左子树，右子树较大的高度并加1
            return (h1>h2?h1+1:h2+1);
        }else {
            return 0;
        }


    }

    @Override
    public Node findKey(int value) {
        return this.findKey(value,root);
    }
    private Node findKey(Object  value,Node node) {
        //节点为空可变是整个树的根节点，也可能是叶子节点
        if(node==null){
            return null;
        }else if(node !=null && node.value==value){ //递归的结束条件，如果找到了就结束递归
            return  node;
        }else {
           Node node1=this.findKey(value,node.leftChild);
           Node node2=this.findKey(value,node.rightChild);
           if(node1 != null && node1.value==value){
               return node1;
           }else if(node2 !=null && node2.value==value){
               return node2;
           }else {
               return null;
           }

        }

    }

    @Override
    public void preOrederTraverse() {
        if(root!=null){
            //输出根节点的值
            System.out.print(root.value+ "    ");
            //对左子树进行先序遍历
            BinaryTree leftTree=new LinkedBinaryTreee(root.leftChild);
            leftTree.preOrederTraverse();
            //对右子树进行先序遍历
            BinaryTree rightTree=new LinkedBinaryTreee(root.rightChild);
            rightTree.preOrederTraverse();
        }

    }

    @Override
    public void inOrderTraverse() {
        System.out.println("中序遍历");
        inOrderTraverse(root);
        System.out.println();
    }

    @Override
    public void inOrderTraverse(Node node) {        //node7
        if(node!=null){
            //遍历左子树
            this.inOrderTraverse(node.leftChild);  //null
            //输出根的值
            System.out.print(node.value+"    ");     //
            //遍历右子树
            this.inOrderTraverse(node.rightChild);  //null
        }
    }

    @Override
    public void postOrderTraverse() {
        System.out.println("后序遍历");
        postOrderTraverse(root);
        System.out.println();
    }

    @Override
    public void postOrderTraverse(Node node) {
        if(node!=null){
            //遍历左子树
            this.postOrderTraverse(node.leftChild);
            //遍历右子树
            this.postOrderTraverse(node.rightChild);
            //输出根的值
            System.out.print(node.value+"    ");
        }

    }

    @Override
    public void preOrederTraverse(Node node) {

    }



    @Override
    public void levelOrderBystace() {

    }
}
