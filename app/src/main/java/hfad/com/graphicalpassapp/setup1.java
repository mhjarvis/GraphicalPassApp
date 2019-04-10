package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

import org.w3c.dom.Text;

public class setup1 extends Activity {

    public static final String EXTRA_MESSAGE = "loginText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup1);
    }

    //action to go to setup screen 2
    public void getSetupPage_2(View view){
        Intent goToSetupScreen2 = new Intent(this, setup2.class);
        startActivity(goToSetupScreen2);
    }

    //declare static string for password part 1
    public static final String MY_PREFS_NAME = "Password_Part_1";


    /* FUNCTION TO SAVE PASSWORD PART 1 TO SHARED PREFERENCES */
    public void save_Password_Part_1(String value){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String key = "password_key_part_1";
        editor.putString(key, value); //
        editor.apply(); //commit changes
    }

    /* FUNCTION TO RETRIEVE STORED VALUE (for testing here) */
    public String printName() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        String phrase=pref.getString("password_key_part_1", null); //variable 'phrase' holds value of key_name5
        return phrase;  //return value to 'useElephant()'

    }

    public void useBunny(View view){
        save_Password_Part_1("bunny");

        TextView total = (TextView) findViewById(R.id.textViewName);
        total.setText(printName()); //call printName function to retrieve values

    }
    //execute when clicking on elephant image
    public void useElephant(View view){
        save_Password_Part_1("elephant");

        /*
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("key_name5", "elephant"); //save "elephant" to key_name5
        editor.apply(); //commit changes */

        //testing - prints value to setup screen 1
        TextView total = (TextView) findViewById(R.id.textViewName);
        total.setText(printName()); //call printName function to retrieve values
    }



}
