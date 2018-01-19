package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

/**
 * Created by nynic on 2018-01-18.
 */



public class AngryMood extends CurrentMood{
    /**
     *
     * @param moodString the  mood string
     */
    public AngryMood(String moodString){
        super(moodString);
    }

    /**
     *
     * @param moodString the mood string
     * @param c_date the current date
     */
    public AngryMood(String moodString, Date c_date){
        super(moodString, c_date);
    }

    /**
     *
     * @return returns the tweet but with a mood.
     */
    @Override
    public String getCurrentMood(){
        Log.i("info Tweet", super.getCurrentMood() + " -- Angry ヽ(ಠ_ಠ)ノ");
        return super.getCurrentMood() + " -- Angry ヽ(ಠ_ಠ)ノ";
    }
}
