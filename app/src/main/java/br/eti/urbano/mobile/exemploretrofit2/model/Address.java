package br.eti.urbano.mobile.exemploretrofit2.model;

public class Address {
    protected String street;
    protected String suite;
    protected String city;
    protected String zipcode;
    protected Geo geo;

    public Address(String street, String suite, String city, String zipcode, Geo geo) {
        this.setStreet(street);
        this.setSuite(suite);
        this.setCity(city);
        this.setZipcode(zipcode);
        this.setGeo(geo);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() { return suite; }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Geo getGeo() { return geo; }

    public void setGeo(Geo geo) { this.geo = geo; }
}