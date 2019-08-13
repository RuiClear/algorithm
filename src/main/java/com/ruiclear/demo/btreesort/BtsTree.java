package com.ruiclear.demo.btreesort;

public class BtsTree {

    public BtsTree(int data) {
        this.data = data;
        this.bf = 0;
    }

    private int data;
    //左节点
    private BtsTree lChild;
    //右节点
    private BtsTree rChild;
    //父节点
    private BtsTree pChild;
    //平衡因子
    private int bf;


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BtsTree getlChild() {
        return lChild;
    }

    public BtsTree getpChild() {
        return pChild;
    }

    public void setpChild(BtsTree pChild) {
        this.pChild = pChild;
    }

    public void setlChild(BtsTree lChild) {
        this.lChild = lChild;
    }

    public BtsTree getrChild() {
        return rChild;
    }

    public void setrChild(BtsTree rChild) {
        this.rChild = rChild;
    }
}
