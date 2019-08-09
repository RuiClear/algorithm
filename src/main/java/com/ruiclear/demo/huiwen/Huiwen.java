package com.ruiclear.demo.huiwen;

/**
 * 单链表检查是否是回文   回文：abccba
 * 基本思路：设置两个快慢指针，快指针一次走2个节点，满的走1个节点，当快的走到底，此时满的正好处在链表的中间，同时慢指针走过每一个节点都重新将前
 * 半部分重新构建一个逆序链表
 */
public class Huiwen {

    public static boolean isHuiwen(SingtonLinkNode headNode){
        SingtonLinkNode perv= null;//前半部分逆序

        SingtonLinkNode slow = headNode;
        SingtonLinkNode fast = headNode;
        while(fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            //暂存以下slow的下一个节点
            SingtonLinkNode next = slow.getNext();
            slow.setNext(perv);

            //指针下移
            perv = slow;
            slow = next;

        }
        if (fast != null) {
            slow = slow.getNext();
        }

        while (slow != null) {
            if (slow.getData() != perv.getData()) {
                return false;
            }
            slow = slow.getNext();
            perv = perv.getNext();
        }

        return true;
    }
    public static void main(String[] args) {
        SingtonLinkNode linkNode = new SingtonLinkNode();
        linkNode.setData("a");

        SingtonLinkNode linkNode1 = new SingtonLinkNode();
        linkNode1.setData("b");

        SingtonLinkNode linkNode2 = new SingtonLinkNode();
        linkNode2.setData("c");

        SingtonLinkNode linkNode3 = new SingtonLinkNode();
        linkNode3.setData("c");

        SingtonLinkNode linkNode4 = new SingtonLinkNode();
        linkNode4.setData("b");

        SingtonLinkNode linkNode5 = new SingtonLinkNode();
        linkNode5.setData("a");

        linkNode.setNext(linkNode1).setNext(linkNode2).setNext(linkNode3).setNext(linkNode4).setNext(linkNode5);

        boolean huiwen = Huiwen.isHuiwen(linkNode);
        System.out.println(huiwen);
    }


}
