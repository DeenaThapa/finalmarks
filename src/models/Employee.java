package models;

public class Employee extends Member{
    public Employee(String name, int age, int contact, String address, int salary, String department) {
        super(name, age, contact, address, salary);
        this.department = department;
    }

    String department;
}
