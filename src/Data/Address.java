package Data;

public class Address {
    private String streetName;
    private String cityName;

    public Address(String newStreet, String newCity) {
        streetName = newStreet;
        cityName = newCity;
    }

    public String getFullAddress() {
        return streetName + ", " + cityName;
    }

}
