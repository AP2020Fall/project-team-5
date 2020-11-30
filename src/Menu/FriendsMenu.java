package Menu;

import people.model.User;

public interface FriendsMenu {
    String showFriends(User user);
    void remove(User user);
    String viewUserProfile(User user);
    String showFriendsRequest();
    void add(User user);
    void accept(User user);
    void decline(User user);

}
