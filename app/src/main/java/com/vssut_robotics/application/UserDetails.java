package com.vssut_robotics.application;

/**
 * Created by Hp on 09-01-2017.
 */

public class UserDetails {

    private String name;
    private String mobile;
    private String image;

    public UserDetails(){

    }

    public UserDetails(String name, String mobile, String image) {
        this.name = name;
        this.mobile = mobile;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
