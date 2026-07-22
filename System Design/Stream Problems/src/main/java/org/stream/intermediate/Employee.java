package org.stream.intermediate;

public class Employee {

    private Long id;
    private String name;
    private String department;
    private double salary;
    private String gender;
    private int age;

    public Employee(Long id, String name, String department,
                    double salary, String gender, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
