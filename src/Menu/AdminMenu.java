package Menu;

import java.util.Date;

public interface AdminMenu {
    void addEvent(int eventID, Date startDate, Date endDate, double score);

    String viewEvents();

    void editEvent(int eventID, String field, String newValue);

    void removeEvent(int eventID);

    void addSuggestion(String username, String gameName);

    String viewSuggestions();

    void removeSuggestion(int suggestionID);

    String viewUsers();

    void viewUserProfile(String username);
}
