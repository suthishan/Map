package com.example.roydana.map;

public class User {
    private int id;
    private String name;
    private String email;
    private String mobile;
    private String password;
    private String number1;
    private String number2;

//    public User(int id, String userName, String email, String password, String mobile, String number1, String number2) {
//        this.id = id;
//        this.name = userName;
//        this.email = email;
//        this.password = password;
//        this.mobile = mobile;
//        this.number1 = number1;
//        this.number2 = number2;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }
}
