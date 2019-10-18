package org.demo.guicedemo2;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Start {

    public static void main(final String[] args) {

        final Injector injector = Guice.createInjector();
        final UserService userService = injector.getInstance(UserService.class);
        userService.say();
    }


}
