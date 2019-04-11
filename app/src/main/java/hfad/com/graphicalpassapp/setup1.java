package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class setup1 extends Activity {

    public static final String EXTRA_MESSAGE = "setupText1";
    //public static final String MY_PREFS_NAME = "Password_Part_1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup1);
    }

    public void getSetupPage_2(View view){
        Intent goToSetupScreen2 = new Intent(this, setup2.class);
        startActivity(goToSetupScreen2);
    }

    /******* FUNCTION TO SAVE PASSWORD PART 1 TO SHARED PREFERENCES *******/
    public void save_Password_Part_1(String value){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String key = "password_key_part_1";
        editor.putString(key, value); //
        editor.apply(); //commit changes
    }

    /******* FUNCTION TO RETRIEVE STORED VALUE (for testing here) *******/
    public void printName() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        //return pref.getString("password_key_part_1", null);
        String returnKey = pref.getString("password_key_part_1", null);
        TextView total = (TextView) findViewById(R.id.textViewName);
        total.setText(returnKey); //call printName function to retrieve values
    }
    /******* INDIVIDUAL IMAGEBUTTONS *******/
    public void useBunny(View view){
        save_Password_Part_1("bunny");
        printName();
    }

    public void useElephant(View view){
        save_Password_Part_1("elephant");
        printName();
    }

    public void useFish(View view){
        save_Password_Part_1("fish");
        printName();
    }

    public void useZebra(View view){
        save_Password_Part_1("zebra");
        printName();
    }

    public void useLion(View view){
        save_Password_Part_1("lion");
        printName();
    }

    public void useHawk(View view){
        save_Password_Part_1("hawk");
        printName();
    }

    public void useScorpion(View view){
        save_Password_Part_1("scorpion");
        printName();
    }

    public void useHippo(View view){
        save_Password_Part_1("hippo");
        printName();
    }
}

        /*
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("key_name5", "elephant"); //save "elephant" to key_name5
        editor.apply(); //commit changes

        testing - prints value to setup screen 1
        TextView total = (TextView) findViewById(R.id.textViewName);
        total.setText(printName()); //call printName function to retrieve values */