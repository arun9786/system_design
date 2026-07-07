package org.example.abstractfactory;

public class Main {
    public static void main(String[] args) {
        CloudFactory cloudFactory = new AWSFactory();

        ClientService clientService = new ClientService(cloudFactory);

        clientService.store("file.txt");

        clientService.process("This is Arun");

    }
}
