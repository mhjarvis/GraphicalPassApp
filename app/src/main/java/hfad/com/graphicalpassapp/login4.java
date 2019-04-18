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

    /******* FUNCTION TO RETRIEVE STORED VALUE (for testing here) *******/
    public void testPrintName() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        //return pref.getString("password_key_part_2", null);
        String returnKey = pref.getString("test_password_key_part_4", null);
        TextView total = (TextView) findViewById(R.id.testTextViewName4);
        total.setText(returnKey); //call printName function to retrieve values
    }

    /******* INDIVIDUAL IMAGEBUTTONS *******/
    public void useabc(View view){
        testPassword_Part_4("abc");
        testPrintName();
    }
    public void useCompas(View view){
        testPassword_Part_4("compass");
        testPrintName();
    }

    public void useGlobe(View view){
        testPassword_Part_4("globe");
        testPrintName();
    }

    public void useGrapes(View view){
        testPassword_Part_4("grapes");
        testPrintName();
    }

    public void useWeb(View view){
        testPassword_Part_4("web");
        testPrintName();
    }

    public void useSpirral(View view){
        testPassword_Part_4("spirral");
        testPrintName();
    }

    public void useBranch(View view){
        testPassword_Part_4("branch");
        testPrintName();
    }

    public void useVulture(View view){
        testPassword_Part_4("vulture");
        testPrintName();
    }
}
