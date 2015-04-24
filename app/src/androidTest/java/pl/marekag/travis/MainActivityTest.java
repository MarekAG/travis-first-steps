package pl.marekag.travis;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;

public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {
    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    public MainActivityTest() {
        super(MainActivity.class);
    }

    private MainActivity mainActivity;


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(getInstrumentation().getTargetContext(),
                MainActivity.class);
        startActivity(intent, null, null);
        mainActivity = getActivity();
    }



    @SmallTest
    public void testUI() throws Exception {
//        final int expected = 1;
//        final int reality = 5;
//        assertEquals(expected, reality);
        // Verifies the button and text field exist
        assertNotNull(mainActivity.findViewById(R.id.button));
        assertNotNull(mainActivity.findViewById(R.id.myText));
        // Verifies the text of the button
        Button view = (Button) mainActivity.findViewById(R.id.button);
        assertEquals("Incorrect label of the button", "Launch", view.getText());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
