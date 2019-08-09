package com.ruiclear.demo.sort;

import java.util.Random;

public class BubbleSort {

    public static void sort(int[] a){
        int length = a.length;
        for(int i=0;i<length;i++){
            boolean flag = false;
            for(int j=0;j<length-1-i;j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;

                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int size = 200000;
        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i] = size-i;
        }
        long l = System.currentTimeMillis();
        sort(a);
        System.out.println(System.currentTimeMillis()-l); //耗时 13791 ms
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
}
