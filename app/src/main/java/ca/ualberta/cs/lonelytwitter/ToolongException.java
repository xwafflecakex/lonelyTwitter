package ca.ualberta.cs.lonelytwitter;

/**
 * Created by nynic on 2018-01-17.
 */

public class ToolongException extends Throwable {
    /**
     * The exception class if the tweet is too long.
     */
    public class TweetTooLongException extends Exception {
        public TweetTooLongException() {
        }

        public TweetTooLongException(String detailMessage) {
            super(detailMessage);
        }
    }
}
