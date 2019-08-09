package com.ruiclear.demo.sort;

import java.util.Random;

public class QuickSort {
    private static int count=0;

    public static void sort(int[] a,int p,int end){
        if(p < 0 || p>=end)
            return;
//        System.out.println(count++);
        int q = partition(a,p,end);
        sort(a, p, q - 1);
        sort(a,q+1,end-1);

    }

    public static int partition(int[] a,int p,int end){

        int middle = a[end];
        int j = p;
        for(int i=p;i<=end;i++){
            if(i!=j && a[i] < middle){
                swap(a,j++,i);
            }
        }
        swap(a,j,end);
        return j;
    }
    public static void swap(int[] a,int i,int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        //生成完全倒序的数组
        int size = 200000;
        Random random = new Random();
        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i] = random.nextInt(size);
        }
        long l = System.currentTimeMillis();
        sort(a,0,a.length-1);
        System.out.println(System.currentTimeMillis()-l);//耗时 7075 ms
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+ " ");
//        }
    }
}
