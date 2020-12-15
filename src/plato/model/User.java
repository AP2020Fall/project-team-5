package plato.model;

import java.util.ArrayList;

public class User {
    public static ArrayList<User> getUsers() {
        return users;
    }

    private static ArrayList<User> users= new ArrayList<>();
    private String firstname;
    private String lastName;
    private String userID;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;

    public User(String firstname, String lastName, String username, String password, String email, String phoneNumber) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    ////// what's this?
    public static User getUserID(User userID) {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}


