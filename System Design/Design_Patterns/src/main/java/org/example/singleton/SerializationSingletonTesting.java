package org.example.singleton;

import java.io.*;

public class SerializationSingletonTesting {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("text.txt"));
//        oos.writeObject(lazySingleton);
//        oos.close();
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("text.txt"));
//        LazySingleton readLazySingleTone = (LazySingleton)ois.readObject();
//        ois.close();
//
//        System.out.println(lazySingleton.hashCode());
//        System.out.println(readLazySingleTone.hashCode());

        SerializationSingleton serializationSingleton = SerializationSingleton.getInstance();
        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("text.txt"));
        oos2.writeObject(serializationSingleton);
        oos2.close();

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("text.txt"));
        SerializationSingleton readSerializationSingleton = (SerializationSingleton)ois2.readObject();
        ois2.close();

        System.out.println(serializationSingleton.hashCode());
        System.out.println(readSerializationSingleton.hashCode());
    }

}
