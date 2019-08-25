package org.demo.guicedemo.helloworlddemo;

import java.io.PrintStream;

public class PrintStreamWriter implements MyDestination {

    private PrintStream destination;

    public PrintStreamWriter(PrintStream destination) {
        this.destination = destination;
    }

    public void write(String outputString) {
        destination.println(outputString);
    }
}
