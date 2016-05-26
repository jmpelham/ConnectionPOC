package com.morethanwinners.business;

import android.location.Address;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Created by ShanitaP on 5/20/2016.
 */
public class Business implements Parcelable{
    String name;
    Address address;
    String phoneNumber;
    String type;
    String desc;
    Rating rating;
    String website;
    HashMap<String, String> hoursOfOperation;
    String owner;

    @Override
    public String toString() {
        return getName();
    }

    public Business(String name, String phoneNumber, String type) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public Business(String name, Address address, String phoneNumber, String type, String desc, Rating rating, String website, HashMap<String, String> hoursOfOperation, String owner) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.desc = desc;
        this.rating = rating;
        this.website = website;
        this.hoursOfOperation = hoursOfOperation;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public HashMap<String, String> getHoursOfOperation() {
        return hoursOfOperation;
    }

    public void setHoursOfOperation(HashMap<String, String> hoursOfOperation) {
        this.hoursOfOperation = hoursOfOperation;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private Business(Parcel in) {
        this.name = in.readString();
        this.phoneNumber = in.readString();
        this.type = in.readString();

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    public static final Parcelable.Creator<Business> CREATOR
            = new Parcelable.Creator<Business>() {

        @Override
        public Business createFromParcel(Parcel in) {
            return new Business(in);
        }

        @Override
        public Business[] newArray(int size) {
            return new Business[size];
        }
    };
}
