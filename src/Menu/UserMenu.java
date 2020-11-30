package Menu;

import people.model.Player;

public interface UserMenu {
    String viewAccountMenu();

    void changePassword(String currentPassword, String newPassword);

    void edit(String field, String newValue);

    String viewPlatoStatistics(Player player);

    String viewGamesHistory();

    String viewGameStatistics(String gameName);

    void logout();
}
