package org.demo.guicedemo.helloworlddemo;

import org.demo.guicedemo.MyAppiet;

public class StringWritingApplet implements MyAppiet {

    private MyDestination destination;
    private StringProvider stringProvider;

    public StringWritingApplet(MyDestination destination, StringProvider stringProvider) {
        super();
        this.destination = destination;
        this.stringProvider = stringProvider;
    }

    private void writeString() {
        destination.write(stringProvider.get());
    }

    public void run() {
        writeString();
    }
}
