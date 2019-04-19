package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;


public class login4 extends Activity {
    public static final String EXTRA_MESSAGE = "loginText4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login4);
    }
    public void getStorage(View view){
        Intent goToStorage = new Intent(this, storage.class);
        startActivity(goToStorage);
    }

    /******* FUNCTION TO SAVE PASSWORD PART 1 TO SHARED PREFERENCES *******/
    public void testPassword_Part_4(String value){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String testKey = "test_password_key_part_4";
        editor.putString(testKey, value); //
        editor.apply(); //commit changes
    }

    /* TEST FUNCTION - USE TO DISPLAY USER CHOICE */
    // If used, include 'printName();' in each function below
    /**** FUNCTION TO RETRIEVE STORED VALUE (testing purposes prints to screen)
    public void testPrintName() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        //return pref.getString("password_key_part_2", null);
        String returnKey = pref.getString("test_password_key_part_4", null);
        TextView total = (TextView) findViewById(R.id.testTextViewName4);
        total.setText(returnKey); //call printName function to retrieve values
    }
     ****/

    //indivudal functions
    public void useabc(View view){
        testPassword_Part_4("abc");
    }
    public void useCompas(View view){
        testPassword_Part_4("compass");
    }

    public void useGlobe(View view){
        testPassword_Part_4("globe");
    }

    public void useGrapes(View view){
        testPassword_Part_4("grapes");
    }

    public void useWeb(View view){
        testPassword_Part_4("web");
    }

    public void useSpirral(View view){
        testPassword_Part_4("spirral");
    }

    public void useBranch(View view){
        testPassword_Part_4("branch");
    }

    public void useVulture(View view){
        testPassword_Part_4("vulture");
    }
}
