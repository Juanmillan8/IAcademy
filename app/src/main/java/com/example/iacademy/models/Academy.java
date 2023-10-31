package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Academy")
public class Academy {

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "country")
    private String country;

    @ColumnInfo(name = "province")
    private String province;

    @ColumnInfo(name = "city")
    private String city;

    @ColumnInfo(name = "address")
    private String address;

    @ColumnInfo(name = "url")
    private String url;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "phone")
    private String phone;

    @PrimaryKey(autoGenerate = true)
    private long id;

    public Academy(String name, String description, String country, String province, String city, String address, String url, String email, String phone) {
        this.name = name;
        this.description = description;
        this.country = country;
        this.province = province;
        this.city = city;
        this.address = address;
        this.url = url;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getUrl() {
        return url;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void getId(long id){
        this.id = id;
    }
}
