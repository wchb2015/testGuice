package org.demo.guicedemo.helloworlddemo;

import java.io.PrintStream;
import javax.inject.Inject;

public class PrintStreamWriter implements MyDestination {

    private PrintStream destination;

    @Inject
    public PrintStreamWriter(PrintStream destination) {
        this.destination = destination;
    }

    public void write(String outputString) {
        destination.println(outputString);
    }
}
