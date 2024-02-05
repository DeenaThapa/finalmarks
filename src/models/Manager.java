package models;

public class Manager extends Member{
    public Manager(String name, int age, int contact, String address, int salary, String specialization) {
        super(name, age, contact, address, salary);
        this.specialization = specialization;
    }

    String specialization;
}
