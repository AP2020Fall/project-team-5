package plato.battleSea;

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
}
