package org.demo.guicedemo;

import java.io.PrintStream;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.demo.guicedemo.helloworlddemo.MyDestination;
import org.demo.guicedemo.helloworlddemo.PrintStreamWriter;
import org.demo.guicedemo.helloworlddemo.StringWritingApplet;

public class MainModule extends AbstractModule {
    protected void configure() {
        bind(MyAppiet.class).to(StringWritingApplet.class);
        bind(MyDestination.class).to(PrintStreamWriter.class);
        bind(PrintStream.class).toInstance(System.out);

        bind(String.class).toInstance("Hello World!");
    }

//    @Provides
//    private String getString() {
//        return "Hello World!";
//    }
}
