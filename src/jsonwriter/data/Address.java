package jsonwriter.data;

public class Address {
    private final String street;
    private final short apartment;

    public Address(String street, short apartment) {
        this.street = street;
        this.apartment = apartment;
    }

    public String getStreet() {
        return street;
    }

    public short getApartment() {
        return apartment;
    }
}