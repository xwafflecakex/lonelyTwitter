package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nynic on 2018-01-18.
 */

public abstract class CurrentMood {
    private String mood;
    private Date date;

    /**
     *
     * @param moodString the mood string
     * @param c_date the date currently
     */
    public  CurrentMood(String moodString, Date c_date) {
        mood = moodString;
        date = c_date;
    }

    /**
     *
     * @param moodString the mood string
     */
    public CurrentMood(String moodString) {
        mood = moodString;
        date = new Date();
    }

    /**
     * Getter for date
     * @return the current date
     */
    public Date getCurrentDate() {
        return date;
    }

    /**
     * Setter for date
     * @param date the date
     */
    public void setCurrentDate(Date date) {
        this.date = date;
    }

    /**
     * Getter for mood
     * @return the  current mood string
     */
    public String getCurrentMood() {
        return mood;
    }

    /**
     * Setter for mood
     * @param mood the mood string
     */
    public void setCurrentMood(String mood) {
        this.mood = mood;
    }
}
