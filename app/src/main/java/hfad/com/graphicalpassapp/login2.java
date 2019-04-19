package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;


public class login2 extends Activity {

    public static final String EXTRA_MESSAGE = "loginText2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }


    // go to next set of images (2 of 4)
    public void getLoginPage_3(View view){
        Intent goToLoginScreen2 = new Intent(this, login3.class);
        startActivity(goToLoginScreen2);
    }
    /******* FUNCTION TO SAVE PASSWORD PART 1 TO SHARED PREFERENCES *******/
    public void testPassword_Part_2(String value){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String testKey = "test_password_key_part_2";
        editor.putString(testKey, value); //
        editor.apply(); //commit changes
    }

    /* TEST FUNCTION - USE TO DISPLAY USER CHOICE */
    // If used, include 'printName();' in each function below
    /**** FUNCTION TO RETRIEVE STORED VALUE (testing purposes prints to screen)
    public void testPrintName() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        //return pref.getString("password_key_part_2", null);
        String returnKey = pref.getString("test_password_key_part_2", null);
        TextView total = (TextView) findViewById(R.id.testTextViewName2);
        total.setText(returnKey); //call printName function to retrieve values
    }
     ****/

    //FUNCTIONS FOR INDIVIDUAL IMAGES
    public void useBear(View view){
        testPassword_Part_2("bear");
    }
    public void useDetective(View view){
        testPassword_Part_2("detective");
    }

    public void useGreenMonster(View view){
        testPassword_Part_2("GreenMonster");
    }

    public void useMonkey(View view){
        testPassword_Part_2("monkey");
    }

    public void usePig(View view){
        testPassword_Part_2("pig");
    }

    public void useRat(View view){
        testPassword_Part_2("rat");
    }

    public void useSecurity(View view){
        testPassword_Part_2("security");
    }

    public void useThief(View view){
        testPassword_Part_2("thief");
    }
}
