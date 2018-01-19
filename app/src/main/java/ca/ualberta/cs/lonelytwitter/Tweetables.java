package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by nynic on 2018-01-17.
 */

public interface Tweetables {
    public String getMessage();
    public void setMessage(String message) throws ToolongException;
    public Date getDate();
}
