package org.example.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
    }
}
