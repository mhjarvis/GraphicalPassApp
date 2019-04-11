package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class setup4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup4);
    }

    public void getStorage(View view){
        Intent goToStorage = new Intent(this, storage.class);
        startActivity(goToStorage);
    }

    /******* FUNCTION TO SAVE PASSWORD PART 3 TO SHARED PREFERENCES *******/
    public void save_Password_Part_4(String value) {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String key = "password_key_part_4";
        editor.putString(key, value);
        editor.apply(); //commit changes
    }

    /******* FUNCTION TO RETRIEVE STORED VALUE (for testing here) *******/
    public void printName4() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        String returnKey = pref.getString("password_key_part_4", null);
        TextView total = (TextView) findViewById(R.id.textViewName4);
        total.setText(returnKey); //call printName function to retrieve values
    }

    public void useabc(View view) {
        save_Password_Part_4("abc");
        printName4();
    }

    public void useCompas(View view) {
        save_Password_Part_4("compass");
        printName4();
    }

        public void useGlobe(View view){
            save_Password_Part_4("globe");
            printName4();
        }

        public void useGrapes(View view){
            save_Password_Part_4("grapes");
            printName4();
        }

        public void useWeb(View view){
            save_Password_Part_4("web");
            printName4();
        }

        public void useSpirral(View view){
            save_Password_Part_4("spirral");
            printName4();
        }

        public void useBranch(View view){
            save_Password_Part_4("branch");
            printName4();
        }

        public void useVulture(View view){
            save_Password_Part_4("vulture");
            printName4();
        }

}
