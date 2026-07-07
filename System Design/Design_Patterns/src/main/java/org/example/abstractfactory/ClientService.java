package org.example.abstractfactory;

public class ClientService {
    Storage storage;
    MessageQueue messageQueue;

    public ClientService() {}

    public ClientService(CloudFactory cloudFactory) {
        this.storage = cloudFactory.getStorage();
        this.messageQueue = cloudFactory.getMessageQueue();
    }


    public void store(String file) {
        storage.store(file);
    }

    public void process(String msg) {
        messageQueue.process(msg);
    }
}
