package br.eti.urbano.mobile.exemploretrofit2.model;

public class Users {

    protected Integer id;
    protected String name;
    protected String username;
    protected String email;
    protected Address address;
    protected String phone;
    protected String website;
    protected Company company;

    public Users() { }

    public Users(Integer id, String name, String username, String email, String phone, String website, Company company) {
        this.setId(id);
        this.setName(name);
        this.setUsername(username);
        this.setEmail(email);
        this.setPhone(phone);
        this.setWebsite(website);
        this.setCompany(company);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() { return address; }

    public void setAddress(Address address) { this.address = address; }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + getId() + ", " +
                "name:" + getName() + ", " +
                "username:" + getUsername() + ", " +
                "email:" + getEmail() + ", " +
                "phone:" + getPhone() + ", " +
                "website:" + getWebsite() + " " +
                "}";
    }
}