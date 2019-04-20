package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

public class setup1 extends Activity {

    public static final String EXTRA_MESSAGE = "setupText1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup1); //link to setup1 xml
    }

    // logic for "NEXT button
    public void getSetupPage_2(View view){
        Intent goToSetupScreen2 = new Intent(this, setup2.class); //create intent
        startActivity(goToSetupScreen2); //execute intent
    }

    /******* FUNCTION - SAVE PASSWORD PART 1 TO SHARED PREFERENCES *******/
    public void save_Password_Part_1(String value){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE); //for accessing Shared Preferences for temp storage
        SharedPreferences.Editor editor = pref.edit();
        String key = "password_key_part_1"; //key name for reference
        editor.putString(key, value); //key/value combination - will save user's choice for later
        editor.apply(); //commit changes
    }

    /* TEST FUNCTION - USE TO DISPLAY USER CHOICE */
    // If used, include 'printName();' in each function below
    /**** FUNCTION TO RETRIEVE STORED VALUE (testing purposes prints to screen)
    public void printName() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        String returnKey = pref.getString("password_key_part_1", null);
        TextView total = (TextView) findViewById(R.id.textViewName);
        total.setText(returnKey); //call printName function to retrieve values
    }
    ****/


    //FUNCTIONS FOR INDIVIDUAL IMAGES
    public void useBunny(View view){
        save_Password_Part_1("bunny");
        ImageButton btn = findViewById(R.id.imageButton2);
        btn.setImageResource(R.drawable.bunny_selected);
    }

    public void useElephant(View view){
        save_Password_Part_1("elephant");
        ImageButton btn = findViewById(R.id.imageButton1);
        btn.setImageResource(R.drawable.elephant_selected);
    }

    public void useFish(View view){
        save_Password_Part_1("fish");
        ImageButton btn = findViewById(R.id.imageButton3);
        btn.setImageResource(R.drawable.fish_selected);
    }

    public void useZebra(View view){
        save_Password_Part_1("zebra");
        ImageButton btn = findViewById(R.id.imageButton4);
        btn.setImageResource(R.drawable.zebra_selected);
    }

    public void useLion(View view){
        save_Password_Part_1("lion");
        ImageButton btn = findViewById(R.id.imageButton5);
        btn.setImageResource(R.drawable.lion_selected);
    }

    public void useHawk(View view){
        save_Password_Part_1("hawk");
        ImageButton btn = findViewById(R.id.imageButton6);
        btn.setImageResource(R.drawable.owl_selected);
    }

    public void useScorpion(View view){
        save_Password_Part_1("scorpion");
        ImageButton btn = findViewById(R.id.imageButton7);
        btn.setImageResource(R.drawable.scorpion_selected);
    }

    public void useHippo(View view){
        save_Password_Part_1("hippo");
        ImageButton btn = findViewById(R.id.imageButton8);
        btn.setImageResource(R.drawable.hippo_selected);
    }
}
