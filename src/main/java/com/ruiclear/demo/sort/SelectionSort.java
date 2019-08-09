package com.ruiclear.demo.sort;

import java.util.Random;

public class SelectionSort {

    public static void sort(int[] a){
        int length = a.length;
        for(int i=0;i<length;i++){
            int min = a[i];
            int b = i;
            for(int j=i;j<length;j++){
                if(a[j] < min){
                    min = a[j];
                    b = j;
                }
            }

            a[b] = a[i];
            a[i] = min;
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
        System.out.println(System.currentTimeMillis()-l);//耗时 27512 ms
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+ " ");
//        }
    }
}
