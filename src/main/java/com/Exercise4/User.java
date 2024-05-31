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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
