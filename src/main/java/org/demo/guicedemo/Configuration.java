package org.demo.guicedemo;

import org.demo.guicedemo.helloworlddemo.HelloWorldPrinter;

// from abstract to concrete
public class Configuration {
    public static MyAppiet getMainApplet() {
        return new HelloWorldPrinter();
    }
}
