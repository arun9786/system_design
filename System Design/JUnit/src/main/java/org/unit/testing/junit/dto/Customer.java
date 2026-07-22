package org.unit.testing.junit.dto;

public class Customer {

    private Long id;
    private String name;
    private String mobile;

    public Customer(Long id, String name, String mobile) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }
}