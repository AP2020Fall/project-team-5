public class Event {
    private String gameName;
    private String dateOfEventStart;
    private String getDateOfEventEnd;
    private Integer scoreGainingOfEvent;
    private String eventID;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getDateOfEventStart() {
        return dateOfEventStart;
    }

    public void setDateOfEventStart(String dateOfEventStart) {
        this.dateOfEventStart = dateOfEventStart;
    }

    public String getGetDateOfEventEnd() {
        return getDateOfEventEnd;
    }

    public void setGetDateOfEventEnd(String getDateOfEventEnd) {
        this.getDateOfEventEnd = getDateOfEventEnd;
    }

    public Integer getScoreGainingOfEvent() {
        return scoreGainingOfEvent;
    }

    public void setScoreGainingOfEvent(Integer scoreGainingOfEvent) {
        this.scoreGainingOfEvent = scoreGainingOfEvent;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public void addEvent(String eventID, Admin userID){

    }

    public void startEvent(String eventID, String dateOfEventStart, Admin userID){

    }
    public void endEvent(String eventID, String getDateOfEventEnd, Admin userID){

    }
    public void deleteEvent(String eventID, Admin userID){

    }
    public void participateInEvent(String eventID, Player userID){

    }
    public void deleteOfEvent(String eventID, Player userID){

    }

}
