package org.example;

public class DatasetRecord {
    // Attributes
    private int age;
    private String name;
    private String city;

    // Constructor
    public DatasetRecord(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }

    // Getters and Setters
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    // toString method
    @Override
    public String toString() {
        return "DatasetRecord{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
