public class GameLog {
    private Integer numberOfPlaying;
    private Integer numberOfWinning;
    private String logID;
    private Integer scoreGainingOfGame;

    public Integer getNumberOfPlaying() {
        return numberOfPlaying;
    }

    public void setNumberOfPlaying(Integer numberOfPlaying) {
        this.numberOfPlaying = numberOfPlaying;
    }

    public Integer getNumberOfWinning() {
        return numberOfWinning;
    }

    public void setNumberOfWinning(Integer numberOfWinning) {
        this.numberOfWinning = numberOfWinning;
    }

    public String getLogID() {
        return logID;
    }

    public void setLogID(String logID) {
        this.logID = logID;
    }

    public Integer getScoreGainingOfGame() {
        return scoreGainingOfGame;
    }

    public void setScoreGainingOfGame(Integer scoreGainingOfGame) {
        this.scoreGainingOfGame = scoreGainingOfGame;
    }

    static public void showNumberOfWinning(int numberOfWinning){

    }
    static public void showNumberOfPlaying(int numberOfPlaying){

    }
}
