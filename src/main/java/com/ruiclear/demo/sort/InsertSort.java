package com.ruiclear.demo.sort;

import java.util.Random;

public class InsertSort {

    public static void  sort(int[] a){
        int length = a.length;
        for(int i=1;i<length;i++){
            int b = a[i];
            int j=i-1;
            for(;j>=0;j--){
                if(a[j] > b){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = b;
        }
    }

    public static void main(String[] args) {
        int size = 200000000;
        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i] = size-i;
        }
        long l = System.currentTimeMillis();
        sort(a);
        System.out.println(System.currentTimeMillis()-l);//耗时 8164 ms
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
}
