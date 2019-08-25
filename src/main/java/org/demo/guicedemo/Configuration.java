package org.demo.guicedemo;

import org.demo.guicedemo.helloworlddemo.StringProvider;
import org.demo.guicedemo.helloworlddemo.StringWritingApplet;
import org.demo.guicedemo.helloworlddemo.PrintStreamWriter;

// from abstract to concrete
public class Configuration {

    public static MyAppiet getMainApplet() {
        return new StringWritingApplet(new PrintStreamWriter(System.out), new StringProvider() {
            public String get() {
                return "Hello World!";
            }
        });
    }

}
