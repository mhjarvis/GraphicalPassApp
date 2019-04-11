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
        setContentView(R.layout.activity_setup2);
    }

    public static final String EXTRA_MESSAGE = "setupText2";
    public static final String MY_PREFS_NAME = "Password_Part_2";

    public void getSetupPage_3(View view) {
        Intent goToSetupScreen3 = new Intent(this, setup3.class);
        startActivity(goToSetupScreen3);
    }

    /******* FUNCTION TO SAVE PASSWORD PART 2 TO SHARED PREFERENCES *******/
    public void save_Password_Part_2(String value) {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String key = "password_key_part_2";
        editor.putString(key, value);
        editor.apply(); //commit changes
    }

    /******* FUNCTION TO RETRIEVE STORED VALUE (for testing here) *******/
    public void printName2() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        String returnKey = pref.getString("password_key_part_2", null);
        TextView total = (TextView) findViewById(R.id.textViewName2);
        total.setText(returnKey); //call printName function to retrieve values
    }

    public void useBear(View view){
        save_Password_Part_2("bear");
        printName2();
    }

    public void useDetective(View view){
        save_Password_Part_2("detective");
        printName2();
    }

    public void useGreenMonster(View view){
        save_Password_Part_2("GreenMonster");
        printName2();
    }

    public void useMonkey(View view){
        save_Password_Part_2("monkey");
        printName2();
    }

    public void usePig(View view){
        save_Password_Part_2("pig");
        printName2();
    }

    public void useRat(View view){
        save_Password_Part_2("rat");
        printName2();
    }

    public void useSecurity(View view){
        save_Password_Part_2("security");
        printName2();
    }

    public void useThief(View view){
        save_Password_Part_2("thief");
        printName2();
    }
}