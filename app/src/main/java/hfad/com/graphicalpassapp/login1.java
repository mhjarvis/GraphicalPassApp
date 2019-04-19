package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class login1 extends Activity {

    public static final String EXTRA_MESSAGE = "loginText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
    }

    // go to next set of images (2 of 4)
    public void getLoginPage_2(View view){
        Intent goToLoginScreen1 = new Intent(this, login2.class);
        startActivity(goToLoginScreen1);
    }

    /******* FUNCTION TO SAVE PASSWORD PART 1 TO SHARED PREFERENCES *******/
    public void testPassword_Part_1(String value){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String testKey = "test_password_key_part_1"; //save value in shared preferences
        editor.putString(testKey, value); // key combination
        editor.apply(); //commit changes
    }

    /* TEST FUNCTION - USE TO DISPLAY USER CHOICE */
    // If used, include 'printName();' in each function below
    /**** FUNCTION TO RETRIEVE STORED VALUE (testing purposes prints to screen)
    public void testPrintName() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        //return pref.getString("password_key_part_1", null);
        String returnKey = pref.getString("test_password_key_part_1", null);
        TextView total = (TextView) findViewById(R.id.testTextViewName);
        total.setText(returnKey); //call printName function to retrieve values
    }
     ****/

    //FUNCTIONS FOR INDIVIDUAL IMAGES
    public void useBunny(View view){
        testPassword_Part_1("bunny");
    }
    public void useElephant(View view){
        testPassword_Part_1("elephant");
    }

    public void useFish(View view){
        testPassword_Part_1("fish");
    }

    public void useZebra(View view){
        testPassword_Part_1("zebra");
    }

    public void useLion(View view){
        testPassword_Part_1("lion");
    }

    public void useHawk(View view){
        testPassword_Part_1("hawk");
    }

    public void useScorpion(View view){
        testPassword_Part_1("scorpion");
    }

    public void useHippo(View view){
        testPassword_Part_1("hippo");
    }
}
