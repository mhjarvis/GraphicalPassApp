package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class setup3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup3);
    }

    public void getSetupPage_4(View view){
        Intent goToSetupScreen4 = new Intent(this, setup4.class);
        startActivity(goToSetupScreen4);
    }

    /******* FUNCTION TO SAVE PASSWORD PART 3 TO SHARED PREFERENCES *******/
    public void save_Password_Part_3(String value) {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String key = "password_key_part_3";
        editor.putString(key, value);
        editor.apply(); //commit changes
    }

    /******* FUNCTION TO RETRIEVE STORED VALUE (for testing here) *******/
    public void printName3() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        String returnKey = pref.getString("password_key_part_3", null);
        TextView total = (TextView) findViewById(R.id.textViewName3);
        total.setText(returnKey); //call printName function to retrieve values
    }

    public void useAnchor(View view){
        save_Password_Part_3("anchor");
        printName3();
    }

    public void useBottle(View view){
        save_Password_Part_3("bottle");
        printName3();
    }

    public void useCoffee(View view){
        save_Password_Part_3("coffee");
        printName3();
    }

    public void useGears(View view){
        save_Password_Part_3("gears");
        printName3();
    }

    public void usePackage(View view){
        save_Password_Part_3("package");
        printName3();
    }

    public void useKey(View view){
        save_Password_Part_3("key");
        printName3();
    }

    public void useRocket(View view){
        save_Password_Part_3("rocket");
        printName3();
    }

    public void useTrack(View view){
        save_Password_Part_3("track");
        printName3();
    }
}
