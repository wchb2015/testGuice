package org.demo.guicedemo2;

import com.google.inject.Singleton;

@Singleton
public class UserDao {

    public void say() {
        System.out.println("save user!");
    }
}

