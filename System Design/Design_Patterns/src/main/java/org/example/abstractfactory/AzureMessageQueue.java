package org.example.abstractfactory;

public class AzureMessageQueue implements MessageQueue {
    @Override
    public void process(String message) {
        System.out.println("Processing AWS message: " + message+": Azure");
    }
}
