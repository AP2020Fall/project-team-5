package people;

import Menu.FriendsMenu;
import Menu.LoginMenu;
import Menu.RegisterMenu;
import Menu.UserMenu;

public class User implements UserMenu, RegisterMenu, LoginMenu, FriendsMenu {
    private String firstname;
    private String lastName;
    private String userID;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;

    public User(String firstname, String lastName, String userName, String password, String email, String phoneNumber) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void logIn() {

    }

    public void logOut() {

    }

    public void editProfile() {

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

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String viewAccountMenu() {
        return null;
    }

    @Override
    public void changePassword(String currentPassword, String newPassword) {

    }

    @Override
    public void edit(String field, String newValue) {

    }

    @Override
    public String viewPlatoStatistics(Player player) {
        return null;
    }

    @Override
    public String viewGamesHistory() {
        return null;
    }

    @Override
    public String viewGameStatistics(String gameName) {
        return null;
    }

    @Override
    public void logout() {

    }

    @Override
    public void Register(String userName, String password) {

    }

    @Override
    public void delete(String userName) {

    }

    @Override
    public void login(String userName) {

    }

    @Override
    public String showFriends(User user) {
        return null;
    }

    @Override
    public void remove(User user) {

    }

    @Override
    public String viewUserProfile(User user) {
        return null;
    }

    @Override
    public String showFriendsRequest() {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void accept(User user) {

    }

    @Override
    public void decline(User user) {

    }
}


