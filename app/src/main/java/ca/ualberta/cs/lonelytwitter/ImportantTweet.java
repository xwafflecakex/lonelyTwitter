package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nynic on 2018-01-18.
 */

public class ImportantTweet extends Tweet{
    ImportantTweet(String message) throws ToolongException {
        super(message);
    }

    ImportantTweet(String message, Date date) throws ToolongException {
        super(date, message);
    }

    @Override
    public boolean isImportant(){
        return true;
    }

}
