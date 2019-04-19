package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class setup2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup2); //link to setup1 xml
    }

    public static final String EXTRA_MESSAGE = "setupText2";

    // logic for "NEXT button
    public void getSetupPage_3(View view) {
        Intent goToSetupScreen3 = new Intent(this, setup3.class);
        startActivity(goToSetupScreen3);
    }

    /******* FUNCTION - SAVE PASSWORD PART 2 TO SHARED PREFERENCES *******/
    public void save_Password_Part_2(String value) {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String key = "password_key_part_2"; //key name for reference
        editor.putString(key, value); //key/value combination - will save user's choice for later
        editor.apply(); //commit changes
    }

/* TEST FUNCTION - USE TO DISPLAY USER CHOICE */
// If used, include 'printName();' in each function below
/**** FUNCTION TO RETRIEVE STORED VALUE (testing purposes prints to screen)
    public void printName2() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        String returnKey = pref.getString("password_key_part_2", null);
        TextView total = (TextView) findViewById(R.id.textViewName2);
        total.setText(returnKey); //call printName function to retrieve values
    }
 ****/

    //FUNCTIONS FOR INDIVIDUAL IMAGES
    public void useBear(View view){
        save_Password_Part_2("bear");
    }

    public void useDetective(View view){
        save_Password_Part_2("detective");
    }

    public void useGreenMonster(View view){
        save_Password_Part_2("GreenMonster");
    }

    public void useMonkey(View view){
        save_Password_Part_2("monkey");
    }

    public void usePig(View view){
        save_Password_Part_2("pig");
    }

    public void useRat(View view){
        save_Password_Part_2("rat");
    }

    public void useSecurity(View view){
        save_Password_Part_2("security");
    }

    public void useThief(View view){
        save_Password_Part_2("thief");
    }
}