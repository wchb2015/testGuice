package org.demo.guicedemo.helloworlddemo;

import org.demo.guicedemo.MyAppiet;

public class HelloWorldPrinter implements MyAppiet {


    private void printHelloWorld() {
        System.out.println("Hello World");
    }

    public void run() {
        printHelloWorld();
    }

}
