package org.example.singleton;

public class MultiThreadSingleton {
    private static MultiThreadSingleton instance=null;
    private MultiThreadSingleton(){}
    public static MultiThreadSingleton getInstance(){
        if(instance==null){
            synchronized (LazySingleton.class){
                if(instance==null){
                    instance=new MultiThreadSingleton();
                }
            }
        }
        return instance;
    }

}
