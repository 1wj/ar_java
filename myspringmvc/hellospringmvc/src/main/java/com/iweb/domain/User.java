package com.iweb.domain;

public class User {
   private String name;
   private String password;
   private String userfullname;

    public User() {
    }

    public User(String name, String password, String userfullname) {
        this.name = name;
        this.password = password;
        this.userfullname = userfullname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserfullname() {
        return userfullname;
    }

    public void setUserfullname(String userfullname) {
        this.userfullname = userfullname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", userfullname='" + userfullname + '\'' +
                '}';
    }
}
