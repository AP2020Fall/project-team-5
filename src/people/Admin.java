package people;

import Menu.AdminMenu;

import java.util.Date;

public class Admin extends User implements AdminMenu {
    public Admin(String firstname, String lastName, String userName, String password, String email, String phoneNumber) {
        super(firstname, lastName, userName, password, email, phoneNumber);
    }

    public void register() {

    }

    @Override
    public void addEvent(int eventID, Date startDate, Date endDate, double score) {

    }

    @Override
    public String viewEvents() {
        return null;
    }

    @Override
    public void editEvent(int eventID, String field, String newValue) {

    }

    @Override
    public void removeEvent(int eventID) {

    }

    @Override
    public void addSuggestion(String username, String gameName) {

    }

    @Override
    public String viewSuggestions() {
        return null;
    }

    @Override
    public void removeSuggestion(int suggestionID) {

    }

    @Override
    public String viewUsers() {
        return null;
    }

    @Override
    public void viewUserProfile(String username) {

    }
}
