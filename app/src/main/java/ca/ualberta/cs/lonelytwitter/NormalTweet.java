package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nynic on 2018-01-18.
 */

public class NormalTweet extends Tweet {
    /**
     *
     * @param message the tweet message
     * @throws ToolongException if the tweet message is too long
     */
    NormalTweet(String message) throws ToolongException {
        super(message);

    }
    /**
     *
     * @param message the tweet message
     * @param date  the current date
     * @throws ToolongException if the tweet message is too long
     */
    NormalTweet(String message, Date date) throws ToolongException {
        super(date, message);
    }
    
    /**
     *
     * @return false.
     */
    @Override
    public boolean isImportant(){
        return false;
    }
}
