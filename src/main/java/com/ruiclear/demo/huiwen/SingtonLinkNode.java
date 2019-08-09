package com.ruiclear.demo.huiwen;

public class SingtonLinkNode {

    private String data;
    private SingtonLinkNode next;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public SingtonLinkNode getNext() {
        return next;
    }

    public SingtonLinkNode setNext(SingtonLinkNode next) {
        this.next = next;
        return this.next;
    }
}
