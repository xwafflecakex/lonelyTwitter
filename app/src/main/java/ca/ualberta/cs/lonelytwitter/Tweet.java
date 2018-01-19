package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

/**
 * Created by xwafflecakex on 2018-01-17.
 */

public abstract class Tweet implements Tweetables {
    private Date date;
    private String message;


    /*
    Takes a String message(tweet) and the date it was created and saves it.
    Takes in a Date date and String message.
    Throws an exception class that handles messages that are too long.
     */
    public Tweet(Date date, String message) throws ToolongException {
        this.setMessage(message);
        this.date = date;
    }

    /*
    Takes the String message(tweet) and automatically the current date on the device and saves it.
    Takes in a String message.
    Throws an exception class that handles messages that are too long.
     */

    public Tweet(String message) throws ToolongException {
        this.setMessage(message);
        this.date = new Date(); // current time and date
    }


    /*
    Gets the current date and returns it.
    Returns the Date date.
     */
    public Date getDate() {
        return date;
    }

    /*
    Take the date from the string and set's it as the new date.
    Takes in a Date date.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /*
    Gets the message from the string and returns it.
    Returns a String message.
     */
    public String getMessage() {
        return message;
    }

    /*
    Takes the message from the string and if it too long call TweetTooLongException
    Takes in a String message.
    Throws an exception class that handles messages that are too long.
     */
    public void setMessage(String message) throws ToolongException {
        if (message.length() > 160) {
            throw new ToolongException();
        }
        this.message = message;
    }
    public abstract boolean isImportant();
    /*
    Overrides(replaces) the original string and returns it in a readable form
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;

    }
}
