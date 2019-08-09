package com.ruiclear.demo.sort;

/**
 * 归并排序
 */
public class MergeSort {
    public static void sort(int[] a,int start,int end){
        if(start == end){
            return;
        }
        //分治
        int m = (start + end) /2;
        sort(a,start,m);
        sort(a,m+1,end);

        //合并
        merge(a,start,m+1,end);
    }

    /**
     * 合并两个有序数组为一个大的有序数组
     * @param a
     * @param start
     * @param m
     * @param end
     */
    public static void merge(int[] a,int start,int m,int end){
        //创建一个大小为两个小数组之和的临时数组
        int[] tmp = new int[end - start+1];
        int i = start;
        int j = m;
        int k = 0;

        //从头依次比较两个小数组的值，将较小的值放在tmp的前面，以实现两个有序数组合并为一个有序数组
        while (i<=m && j<=end) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }

        //将长度较长的数组的剩余元素加入到合并数组的尾部
        while (m > i){
            tmp[k++] = a[i++];
        }
        while (end > j){
            tmp[k++] = a[j++];
        }

        //将tmp表中排好序的数据写入到原始数组的相应位置
        for(int z = 0;z<tmp.length;z++){
            a[start+z] = tmp[z];
        }
    }

    public static void main(String[] args) {
        //生成完全倒序的数组
        int size = 10;
        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i] = size-i;
        }
        long l = System.currentTimeMillis();
        sort(a,0,a.length-1);
        System.out.println(System.currentTimeMillis()-l);//耗时 37 ms
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+ " ");
//        }
    }
}
