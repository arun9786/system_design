package org.example.abstractfactory;

public interface CloudFactory {
    Storage getStorage();
    MessageQueue getMessageQueue();
}
