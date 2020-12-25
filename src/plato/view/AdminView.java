package plato.view;

import plato.model.User;

import java.util.Comparator;

public class AdminView extends UserView{
    public String viewEvents() {
        return null;
    }

    public String viewSuggestions() {
        return null;
    }

    public String viewUsers() {
        String users="";
        for(User user : User.getUsers())
        {
            users+=(user.getUsername()+"\n");
        }
        return users;
    }

    public void viewUserProfile(String username) {
        User user = null;
        for(User u : User.getUsers())
        {
            if(u.getUsername().equals(username))
            {
                user = u;
                break;
            }
        }
        if(user == null)
        {
            System.out.println("User not found.");
            return;
        }
        System.out.println("Username: " + user.getUsername() +
                        "\nFirst Name: " + user.getFirstname() +
                        "\nLast Name: " + user.getLastName() +
                        "\nEmail: " + user.getEmail() +
                        "\nUserID: " + user.getUserID() +
                        "\nPhone Number: " + user.getPhoneNumber()
        );
    }
}
