package iuh.fit.se.ltwww_java_25092025_tuan06_nguyentranlong;

public class Address {
    private String city;
    private String state;
    private String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return city + ", " + state + ", " + country;
    }
}