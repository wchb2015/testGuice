package org.demo.guicedemo;

import com.google.inject.Guice;

public class App {

    public static void main(String[] args) {
       /* MyAppiet mainApplet = Configuration.getMainApplet();

        mainApplet.run();*/

        MyAppiet mainApplet = Guice.createInjector(new MainModule())
                .getInstance(MyAppiet.class);

        mainApplet.run();

    }
}
