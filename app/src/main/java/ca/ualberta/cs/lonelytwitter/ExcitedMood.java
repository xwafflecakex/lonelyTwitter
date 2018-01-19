package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nynic on 2018-01-18.
 */

public class ExcitedMood extends CurrentMood{
    /**
     *
     * @param moodString the new mood(Excited).
     */
    public ExcitedMood(String moodString) {
        super(moodString);
    }

    /**
     *
     * @param moodString the new mood(Excited)
     * @param c_date current date
     */
    public ExcitedMood(String moodString, Date c_date) {
        super(moodString, c_date);
    }

    /**
     *
     * @return the new tweet string but with a excited sting added "--Super Excited :D!"
     */
    @Override
    public String getCurrentMood() {
        return super.getCurrentMood() + " --Super Excited :D!";
    }
}
