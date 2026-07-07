package org.example.abstractfactory;

public class AWSFactory implements CloudFactory{
    @Override
    public Storage getStorage() {
        return new AWSStorage();
    }
    @Override
    public MessageQueue getMessageQueue() {
        return new AWSMessageQueue();
    }
}
