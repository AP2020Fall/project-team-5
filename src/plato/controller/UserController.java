package plato.controller;

import plato.model.User;

public class UserController {

    public static boolean exists(String username) {
        for(User user : User.getUsers())
        {
            if(user.getUsername().equals(username)) return true;
        }
        return false;
    }

    public static boolean checkPassword(String username , String password) {
        for(User user : User.getUsers())
        {
            if(user.getUsername().equals(username))
            {
                return user.getPassword().equals(password);
            }
        }
        return true;
    }

    public void logIn(String username,String password) {

    }

    public void logOut(String username,String password) {

    }

    public void editProfile(String username,String password) {

    }

    public void changePassword(String username,String currentPassword, String newPassword) {

    }

    public void edit(String username,String password, String field, String newValue) {

    }

    public void logout(String username,String password) {

    }

    public void Register(String username, String password) {

    }

    public void delete(String username) {

    }

    public void login(String username,String password) {

    }

    public void remove(User user) {

    }

    public void add(User user) {

    }

    public void accept(User user) {

    }

    public void decline(User user) {

    }
}
