package shapes_with_cloneable_deep;

class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {return this.city;};

    @Override
    public String toString() {
        return "Address{city='" + city + "'}";
    }
}
