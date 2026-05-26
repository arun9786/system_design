package org.example.singleton;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {
    private static SerializationSingleton instance=null;
    public static SerializationSingleton getInstance(){
        if(instance==null){
            synchronized (SerializationSingleton.class){
                if(instance==null){
                    instance=new SerializationSingleton();
                }
            }
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }
}
