package com.ruiclear.demo.queue;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeCircularQueue {
    private AtomicInteger head=new AtomicInteger(0);
    private AtomicInteger tail=new AtomicInteger(0);
    private AtomicInteger count=new AtomicInteger(0);
    private int size = 10;
    private String[] data = new String[size];

    public void put(String s){
        if(count.get() == size){
            System.out.println("queue 已满");
            return;
        }

        int tailValue = tail.get();
        int nextValue = (tailValue+1)%size;

        if(tail.compareAndSet(tailValue,nextValue)){
            System.out.println("加入队列："+s);
            data[tailValue] = s;
            count.incrementAndGet();
        }
    }

    public String pop(){
        String s = null;
        if(count.get() == 0){
            System.out.println("queue 已空");
            return s;
        }

        int headValue = head.get();
        int nextValue = (headValue + 1)%size;

        if(head.compareAndSet(headValue,nextValue)){
            s = data[headValue];
            count.decrementAndGet();
        }

        return s;
    }
}
