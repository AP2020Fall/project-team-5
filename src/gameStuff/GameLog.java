package gameStuff;

public class GameLog {
    private Integer numberOfPlaying;
    private Integer numberOfWins;
    private String logID;
    private Integer gameScore;

    public Integer getNumberOfPlaying() {
        return numberOfPlaying;
    }

    public void setNumberOfPlaying(Integer numberOfPlaying) {
        this.numberOfPlaying = numberOfPlaying;
    }

    public Integer getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(Integer numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public String getLogID() {
        return logID;
    }

    public void setLogID(String logID) {
        this.logID = logID;
    }

    public Integer getGameScore() {
        return gameScore;
    }

    public void setGameScore(Integer gameScore) {
        this.gameScore = gameScore;
    }

    static public void showNumberOfWinning(int numberOfWinning) {

    }

    static public void showNumberOfPlaying(int numberOfPlaying) {

    }
}
