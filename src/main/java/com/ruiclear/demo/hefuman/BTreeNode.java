package com.ruiclear.demo.hefuman;

public class BTreeNode {
    private BTreeNode rigetBTree;
    private BTreeNode leftBTree;
    private char data;
    private int weight;

    public BTreeNode getRigetBTree() {
        return rigetBTree;
    }

    public void setRigetBTree(BTreeNode rigetBTree) {
        this.rigetBTree = rigetBTree;
    }

    public BTreeNode getLeftBTree() {
        return leftBTree;
    }

    public void setLeftBTree(BTreeNode leftBTree) {
        this.leftBTree = leftBTree;
    }

    public char getData() {
        return data;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setData(char data) {
        this.data = data;
    }

}
