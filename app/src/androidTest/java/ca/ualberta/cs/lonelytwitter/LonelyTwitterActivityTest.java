package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

//import junit.framework.TestCase;
import com.robotium.solo.Solo;

/**
 * Created by people on 14/09/18.
 */
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {

    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void setUp() throws Exception{
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

    public void testTweet(){
        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);

        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");

        solo.clickOnButton("Save");

        solo.clearEditText((EditText) solo.getView(R.id.body));

        assertTrue(solo.waitForText("Test Tweet!"));

        solo.clickOnButton("Clear");

        assertFalse(solo.waitForText("Test Tweet!", 1, 3000));
    }

    public void testClickTweetList(){

        LonelyTwitterActivity activity = (LonelyTwitterActivity)solo.getcurrentActivity();

        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);

        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");

        solo.clickOnButton("Save");

        solo.clearEditText((EditText) solo.getView(R.id.body));

        assertTrue(solo.waitForText("Test Tweet!"));

        final ListView oldTweetList = activity.getOldTweetList();

        Tweet tweet = (Tweet) oldTweetList.getItemPosition(0);

        assertEquals("Test Tweet!", tweet.getMessage());

        solo.clickInList(0);

        solo.assertCurrentActivity("Wrong Activity", EditTweetActivity.class);

        solo.goBack();

        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
    }


    @Override
    public void tearDown() throws Exception{
        solo.finishOpenedActivities(); //closing the activities after testing.
    }
}