package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;

@Entity
public abstract class Person extends DomainEntity{

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "surNames")
    private  String surNames;

    @ColumnInfo(name = "email")
    private String email;

    @Embedded
    private UserAccount userAccount;

    public Person() {
        super();

    }

    public String getName() {
        return name;
    }

    public String getSurNames() {
        return surNames;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurNames(String surNames) {
        this.surNames = surNames;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
}
