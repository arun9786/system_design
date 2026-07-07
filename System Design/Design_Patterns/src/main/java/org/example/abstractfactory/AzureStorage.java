package org.example.abstractfactory;

public class AzureStorage implements Storage{
    @Override
    public void store(String file) {
        System.out.println("Storing file: " + file+": Azure");
    }
}
