package com;

/*
    二叉树的接口，
    可以有不同的实现类，每个类可以使用不同的存储结构
 */
public interface BinaryTree {
    /*
        是否空树
     */
    boolean isEmpty();
    /*
    节点的数量
     */
    int size();
    /*
        获取二叉树的高度
     */
    int getHeight();

    /*
        查询指定的节点
     */
    Node findKey(int value);//查找

    /*
        先序遍历
     */
    void preOrederTraverse();
    /*
        中序遍历
     */
    void inOrderTraverse();
    /*
        后序遍历
     */
    void postOrderTraverse();

    //重载
    void preOrederTraverse(Node node);

    void inOrderTraverse(Node node);

    void postOrderTraverse(Node node);
    /*
        按照层次遍历
     */
    void levelOrderBystace();
}
