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

    }
}
