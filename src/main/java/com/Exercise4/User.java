package com.Exercise4;

public class User {
    private Long id;
    private String name;
    private String email;


    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
