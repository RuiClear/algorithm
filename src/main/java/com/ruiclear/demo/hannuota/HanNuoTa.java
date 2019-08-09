package com.ruiclear.demo.hannuota;

public class HanNuoTa {

    public static int paly(int n){
        if(n==1){
            return 1;
        }

        return paly(n-1)+2;
    }
}
