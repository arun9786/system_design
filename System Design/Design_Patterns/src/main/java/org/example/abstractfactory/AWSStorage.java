package org.example.abstractfactory;

public class AWSStorage implements Storage {
    @Override
    public void store(String file) {
        System.out.println("Storing file: " + file+": AWS");
    }
}
