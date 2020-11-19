package gameStuff;

public class GameLog {
    private Integer numberOfPlaying;
    private Integer numberOfWins;
    private String logID;
    private Integer gameScore;


    public GameLog(Integer numberOfPlaying, Integer numberOfWins, String logID, Integer gameScore) {
        this.numberOfPlaying = numberOfPlaying;
        this.numberOfWins = numberOfWins;
        this.logID = logID;
        this.gameScore = gameScore;
    }

    public Integer getNumberOfPlaying() {
        return numberOfPlaying;
    }

    public Integer getNumberOfWins() {
        return numberOfWins;
    }

    public String getLogID() {
        return logID;
    }

    public Integer getGameScore() {
        return gameScore;
    }

    static public void showNumberOfWinning(int numberOfWinning) {

    }

    static public void showNumberOfPlaying(int numberOfPlaying) {

    }
}
