package org.demo.guicedemo.helloworlddemo;

import javax.inject.Inject;
import com.google.inject.Provider;
import org.demo.guicedemo.MyAppiet;

public class StringWritingApplet implements MyAppiet {

    private MyDestination destination;
    private Provider<String> stringProvider;


    @Inject
    public StringWritingApplet(MyDestination destination, Provider<String> stringProvider) {
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
