package plato;

import people.model.Admin;
import people.model.Player;

import java.util.Date;

public class Event {
    private String gameName;
    private Date startOfEvent;
    private Date endOfEvent;
    private Integer scoreOfEvent;
    private String eventID;

    public Event(String gameName, Date startOfEvent, Date endOfEvent, Integer scoreOfEvent, String eventID) {
        this.gameName = gameName;
        this.startOfEvent = startOfEvent;
        this.endOfEvent = endOfEvent;
        this.scoreOfEvent = scoreOfEvent;
        this.eventID = eventID;
    }

    public String getGameName() {
        return gameName;
    }

    public Date getStartOfEvent() {
        return startOfEvent;
    }

    public Date getEndOfEvent() {
        return endOfEvent;
    }

    public Integer getScoreOfEvent() {
        return scoreOfEvent;
    }

    public String getEventID() {
        return eventID;
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
