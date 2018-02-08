package ca.ualberta.cs.lonelytwitter;

public class NormalTweet extends Tweet {

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
