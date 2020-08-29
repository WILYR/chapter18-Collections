package src.main.java.com.wilyr.javacore.chapter18.collections.example;

public class Address {
    String name;
    String street;
    String city;
    String state;
    String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.state = state;
        this.code = code;
        this.city = city;
    }

    public String toString() {
        return name + "\n" + street + "\n" + city + "" + state + " " + code;
    }
}
