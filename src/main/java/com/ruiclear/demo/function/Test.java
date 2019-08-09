package com.ruiclear.demo.function;

public class Test {
    public static void main(String[] args) {
        FunctionDemo demo = new FunctionDemo();

        demo.function("rui",name ->{
            System.out.println(name);
        });
    }
}
