package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

import static hfad.com.graphicalpassapp.setup1.MY_PREFS_NAME;

public class setup2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup2);

    }


    public void getSetupPage_3(View view){
        Intent goToSetupScreen3 = new Intent(this, setup3.class);
        startActivity(goToSetupScreen3);
    }
    public void useBunny(View view) {
        TextView total = (TextView) findViewById(R.id.textpage2);
        total.setText(printName()); //call printName function to retrieve values
    }

    /* FUNCTION TO RETRIEVE STORED VALUE (for testing here) */
    public String printName() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);  //start shared preferences
        SharedPreferences.Editor editor = pref.edit();
        String phrase=pref.getString("password_key_part_1", null); //variable 'phrase' holds value of key_name5
        return phrase;  //return value to 'useElephant()'

    }


}




