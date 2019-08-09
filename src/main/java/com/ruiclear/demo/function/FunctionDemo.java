package com.ruiclear.demo.function;

import java.util.function.Consumer;

public class FunctionDemo {

    public void function(String name, Consumer<String> consumer){
        consumer.accept(name);
    }
}
