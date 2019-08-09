package com.ruiclear.demo.queue;

public class Test {

    public static void main(String[] args) {
        SafeCircularQueue queue = new SafeCircularQueue();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    queue.put("a"+i);
                }
            }
        };
        for(int i=0;i<20;i++){
            Thread thread = new Thread(runnable);
            thread.start();
        }
        System.out.println("*******************************");

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println(queue.pop());
                }
            }
        };
        for(int i=0;i<20;i++){
            Thread thread = new Thread(runnable1);
            thread.start();
        }

    }
}
