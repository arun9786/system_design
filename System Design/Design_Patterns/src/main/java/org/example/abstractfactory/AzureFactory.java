package org.example.abstractfactory;

public class AzureFactory implements CloudFactory {
    @Override
    public Storage getStorage() {
        return new AzureStorage();
    }
    @Override
    public MessageQueue getMessageQueue() {
        return new AzureMessageQueue();
    }
}
