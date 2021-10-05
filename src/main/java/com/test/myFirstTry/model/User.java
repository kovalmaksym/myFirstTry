package com.test.myFirstTry.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String follows;
    private String email;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String userCode;

    public User() {}

    public User(Long id, String name, String follows, String email, String phone, String imageUrl, String userCode) {
        this.id = id;
        this.name = name;
        this.follows = follows;
        this.phone = phone;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.userCode = userCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFollows() {
        return follows;
    }

    public void setFollows(String follows) {
        this.follows = follows;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

}
