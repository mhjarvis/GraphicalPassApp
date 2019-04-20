package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

public class login3 extends Activity {

    public static final String EXTRA_MESSAGE = "loginText3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);
    }

    // go to next set of images (4 of 4)
    public void getLoginPage_4(View view) {
        Intent goToLoginScreen4 = new Intent(this, login4.class);
        startActivity(goToLoginScreen4);
    }


    /******* FUNCTION TO SAVE PASSWORD PART 1 TO SHARED PREFERENCES *******/
    public void testPassword_Part_3(String value){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String testKey = "test_password_key_part_3";
        editor.putString(testKey, value); //
        editor.apply(); //commit changes
    }

    /* TEST FUNCTION - USE TO DISPLAY USER CHOICE */
    // If used, include 'printName();' in each function below
    /**** FUNCTION TO RETRIEVE STORED VALUE (testing purposes prints to screen)
    public void testPrintName() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        //return pref.getString("password_key_part_2", null);
        String returnKey = pref.getString("test_password_key_part_3", null);
        TextView total = (TextView) findViewById(R.id.testTextViewName3);
        total.setText(returnKey); //call printName function to retrieve values
    }
     ****/

    //FUNCTIONS FOR INDIVIDUAL IMAGES
    public void useAnchor(View view){
        testPassword_Part_3("anchor");
        ImageButton btn = findViewById(R.id.imageButton17);
        btn.setImageResource(R.drawable.anchor_selected);
    }
    public void useBottle(View view){
        testPassword_Part_3("bottle");
        ImageButton btn = findViewById(R.id.imageButton18);
        btn.setImageResource(R.drawable.bottle_selected);
    }

    public void useCoffee(View view){
        testPassword_Part_3("coffee");
        ImageButton btn = findViewById(R.id.imageButton19);
        btn.setImageResource(R.drawable.coffee_selected);
    }

    public void useGears(View view){
        testPassword_Part_3("gears");
        ImageButton btn = findViewById(R.id.imageButton20);
        btn.setImageResource(R.drawable.gears_selected);
    }

    public void usePackage(View view){
        testPassword_Part_3("package");
        ImageButton btn = findViewById(R.id.imageButton21);
        btn.setImageResource(R.drawable.post_selected);
    }

    public void useKey(View view){
        testPassword_Part_3("key");
        ImageButton btn = findViewById(R.id.imageButton22);
        btn.setImageResource(R.drawable.key_selected);
    }

    public void useRocket(View view){
        testPassword_Part_3("rocket");
        ImageButton btn = findViewById(R.id.imageButton23);
        btn.setImageResource(R.drawable.rocket_selected);
    }

    public void useTrack(View view){
        testPassword_Part_3("track");
        ImageButton btn = findViewById(R.id.imageButton24);
        btn.setImageResource(R.drawable.tracks_selected);
    }









}
