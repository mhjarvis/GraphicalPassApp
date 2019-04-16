package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

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
        String testKey = "test_password_key_part_1";
        editor.putString(testKey, value); //
        editor.apply(); //commit changes
    }

    /******* FUNCTION TO RETRIEVE STORED VALUE (for testing here) *******/
    public void testPrintName() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        //return pref.getString("password_key_part_1", null);
        String returnKey = pref.getString("test_password_key_part_1", null);
        TextView total = (TextView) findViewById(R.id.testTextViewName);
        total.setText(returnKey); //call printName function to retrieve values
    }

    /******* INDIVIDUAL IMAGEBUTTONS *******/
    public void useBunny(View view){
        testPassword_Part_1("bunny");
        testPrintName();
    }









}
