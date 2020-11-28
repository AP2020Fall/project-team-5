package plato.model;

import plato.Game;

public class BattleSeaModel {
    public enum Direction {
        HORIZONTAL, VERTICAL
    }

    public static class Ship {
        int xPosition;
        int yPosition;
        Direction direction;
        boolean boomed;
    }

    public static class BattleSea extends Game {
        public BattleSea(String gameID, String gameName) {
            super(gameID, gameName);
        }


    }
}
