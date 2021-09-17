package com.practicalTestspringboot.practicalTestspringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long countryId;
    private String countryCode;
    private String countryName;
    private String countryDesc;

    public Country(Long countryId, String countryCode, String countryName, String countryDesc) {
        this.countryId = countryId;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryDesc = countryDesc;
    }

    public Country() {
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryDesc() {
        return countryDesc;
    }

    public void setCountryDesc(String countryDesc) {
        this.countryDesc = countryDesc;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId=" + countryId +
                ", countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", countryDesc='" + countryDesc + '\'' +
                '}';
    }
}
