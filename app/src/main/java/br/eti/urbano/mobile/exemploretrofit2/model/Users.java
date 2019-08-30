package br.eti.urbano.mobile.exemploretrofit2.model;

public class Users {

    protected Integer id;
    protected String name;
    protected String username;
    protected String email;
    protected String phone;
    protected String website;

    public Users() { }

    public Users(Integer id, String name, String username, String email, String phone, String website) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.website = website;
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

    @Override
    public String toString() {
        return "{" +
            "id:" + id + ", " +
            "name:" + name + ", " +
            "username:" + username + ", " +
            "email:" + email + ", " +
            "phone:" + phone + ", " +
            "website:" + website + " " +
        "}";
    }
}