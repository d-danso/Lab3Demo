package com.Exercise4;

public class User {
    private Long id;
    private String name;
    private String email;


    public User(Long id, String name, String email) {
        this.id = id;
        this.name = (name != null && !name.isEmpty()) ? name : "Default Name";
        this.email = (email != null && !email.isEmpty()) ? email : "default@example.com";
    }

    public User() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
