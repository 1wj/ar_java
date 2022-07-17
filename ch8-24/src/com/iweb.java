package com;

public class iweb {
    public static void main(String[] args) {
        //创建一个二叉树


        Node node5=new Node(5,null,null);
        Node node4=new Node(4,null,node5);
        Node node3=new Node(3,null,null);
        Node node7=new Node(7,null,null);
        Node node6=new Node(6,null,node7);
        Node node2=new Node(2,node3,node6);
        Node node1=new Node(1,node4,node2);

        BinaryTree binaryTree=new LinkedBinaryTreee(node1);

        //判断二叉树是否为空
        System.out.println(binaryTree.isEmpty());

        //先序遍历 1452367
        System.out.println("先序遍历");
        binaryTree.preOrederTraverse();
        System.out.println();

        //中序遍历 4513267
        binaryTree.inOrderTraverse();


        //后序遍历 5437621
        binaryTree.postOrderTraverse();

        //二叉树的高度
        System.out.println(binaryTree.getHeight());

        //在二叉树中查找某个值
        System.out.println("查找节点");
        System.out.println(binaryTree.findKey(1));

        //二叉树的节点数量
        System.out.println(binaryTree.size());
    }
}
