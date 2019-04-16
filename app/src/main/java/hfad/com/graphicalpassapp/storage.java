package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class storage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);

        useBunny();
        useBunny2();
        useBunny3();
        useBunny4();
    }

    public void useBunny() {
        TextView total = (TextView) findViewById(R.id.passwordpart1);
        total.setText(printName()); //call printName function to retrieve values
    }

    /* FUNCTION TO RETRIEVE STORED VALUE (for testing here) */
    public String printName() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);  //start shared preferences
        SharedPreferences.Editor editor = pref.edit();
        String phrase=pref.getString("password_key_part_1", null); //variable 'phrase' holds value of key_name5
        String pass1intro = "Password Part 1: ";
        phrase = pass1intro + phrase;
        return phrase;  //return value to 'useElephant()'

    }

    public void useBunny2() {
        TextView total = (TextView) findViewById(R.id.passwordpart2);
        total.setText(printName2()); //call printName function to retrieve values
    }
    public String printName2() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);  //start shared preferences
        SharedPreferences.Editor editor = pref.edit();
        String phrase=pref.getString("password_key_part_2", null); //variable 'phrase' holds value of key_name5
        String pass1intro = "Password Part 2: ";
        phrase = pass1intro + phrase;
        return phrase;  //return value to 'useElephant()'

    }

    public void useBunny3() {
        TextView total = (TextView) findViewById(R.id.passwordpart3);
        total.setText(printName3()); //call printName function to retrieve values
    }
    public String printName3() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);  //start shared preferences
        SharedPreferences.Editor editor = pref.edit();
        String phrase=pref.getString("password_key_part_3", null); //variable 'phrase' holds value of key_name5
        String pass3intro = "Password Part 3: ";
        phrase = pass3intro + phrase;
        return phrase;  //return value

    }

    public void useBunny4() {
        TextView total = (TextView) findViewById(R.id.passwordpart4);
        total.setText(printName4()); //call printName function to retrieve values
    }
    public String printName4() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);  //start shared preferences
        SharedPreferences.Editor editor = pref.edit();
        String phrase=pref.getString("password_key_part_4", null); //variable 'phrase' holds value of key_name5
        String pass4intro = "Password Part 4: ";
        phrase = pass4intro + phrase;
        return phrase;  //return value

    }

    //use button to pull up note-taking activity
    public void getNotes(View view){
        Intent goToNotes = new Intent(this, notes.class);
        startActivity(goToNotes);
    }
}
