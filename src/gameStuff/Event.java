package gameStuff;

import people.Admin;
import people.Player;

import java.util.Date;

public class Event {
    private String gameName;
    private Date startOfEvent;
    private Date endOfEvent;
    private Integer scoreOfEvent;
    private String eventID;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Date getStartOfEvent() {
        return startOfEvent;
    }

    public void setStartOfEvent(Date startOfEvent) {
        this.startOfEvent = startOfEvent;
    }

    public Date getEndOfEvent() {
        return endOfEvent;
    }

    public void setEndOfEvent(Date endOfEvent) {
        this.endOfEvent = endOfEvent;
    }

    public Integer getScoreOfEvent() {
        return scoreOfEvent;
    }

    public void setScoreOfEvent(Integer scoreOfEvent) {
        this.scoreOfEvent = scoreOfEvent;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public void addEvent(String eventID, Admin userID) {

    }

    public void startEvent(String eventID, Date startOfEvent, Admin userID) {

    }

    public void endEvent(String eventID, Date endOfEvent, Admin userID) {

    }

    public void deleteEvent(String eventID, Admin userID) {

    }

    public void participateInEvent(String eventID, Player userID) {

    }

    public void removeEvent(String eventID, Player userID) {

    }

}
