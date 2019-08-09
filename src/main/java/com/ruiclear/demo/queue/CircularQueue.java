package com.ruiclear.demo.queue;

public class CircularQueue {
    private int head=0;
    private int tail=0;
    //总大小
    private int size =10;
    //当前队列总元素
    private int count = 0;
    private String[] queue = new String[size];



    public void put(String s){
        if(count == size){
            System.out.println("queue已满");
            return;
        }
        System.out.println(s);
        queue[tail] = s;
        tail = (tail+1)%size;
        count++;
    }

    public String pop(){
        if(count == 0){
            System.out.println("queue已空");
            return null;
        }
        String s = queue[head];
        head = (head+1)%size;
        count--;
        return s;
    }
}
