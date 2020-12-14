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

    public void viewUsers() {
        User.getUsers().sort(Comparator.comparing(o -> o.getUsername()));
        for(User user : User.getUsers())
        {
            System.out.println(user.getUsername());
        }
    }

    public void viewUserProfile(String username) {

    }
}
