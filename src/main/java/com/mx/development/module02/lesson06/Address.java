package com.mx.development.module02.lesson06;

import java.util.Optional;

public class Address {
    private volatile String addressLine;
    private volatile String city;
    private Country country;

    public Address(String addressLine, String city) {
        this.addressLine = addressLine;
        this.city = city;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Optional<Country> getCountry() {
        return Optional.ofNullable(country);
    }

    public void setCountry(Country country) {
        this.country = country;
    }   
}
