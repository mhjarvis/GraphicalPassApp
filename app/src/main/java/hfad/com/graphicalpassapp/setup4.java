package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.TextView;

public class setup4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup4); //link to setup4 xml
    }

    //logic for 'NEXT' button
    public void getStorage(View view){
        Intent goToStorage = new Intent(this, storage.class);
        startActivity(goToStorage);
    }

    /******* FUNCTION TO SAVE PASSWORD PART 3 TO SHARED PREFERENCES *******/
    public void save_Password_Part_4(String value) {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String key = "password_key_part_4"; //key name
        editor.putString(key, value);  //key/value combination stored in shared prefernces
        editor.apply(); //commit changes
    }

    /* TEST FUNCTION - USE TO DISPLAY USER CHOICE */
    // If used, include 'printName();' in each function below
    /**** FUNCTION TO RETRIEVE STORED VALUE (testing purposes prints to screen)
    public void printName4() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        String returnKey = pref.getString("password_key_part_4", null);
        TextView total = (TextView) findViewById(R.id.textViewName4);
        total.setText(returnKey); //call printName function to retrieve values
    }
     ****/

    //FUNCTIONS FOR INDIVIDUAL IMAGES
    public void useabc(View view) {
        save_Password_Part_4("abc");
        ImageButton btn = findViewById(R.id.imageButton25);
        btn.setImageResource(R.drawable.blocksabc_selected);
    }

    public void useCompas(View view) {
        save_Password_Part_4("compass");
        ImageButton btn = findViewById(R.id.imageButton26);
        btn.setImageResource(R.drawable.compas_selected);
    }

        public void useGlobe(View view){
            save_Password_Part_4("globe");
            ImageButton btn = findViewById(R.id.imageButton27);
            btn.setImageResource(R.drawable.earthdrawing_selected);
        }

        public void useGrapes(View view){
            save_Password_Part_4("grapes");
            ImageButton btn = findViewById(R.id.imageButton28);
            btn.setImageResource(R.drawable.grapes_selected);
        }

        public void useWeb(View view){
            save_Password_Part_4("web");
            ImageButton btn = findViewById(R.id.imageButton29);
            btn.setImageResource(R.drawable.spiderweb_selected);
        }

        public void useSpirral(View view){
            save_Password_Part_4("spirral");
            ImageButton btn = findViewById(R.id.imageButton30);
            btn.setImageResource(R.drawable.swirls_selected);
        }

        public void useBranch(View view){
            save_Password_Part_4("branch");
            ImageButton btn = findViewById(R.id.imageButton31);
            btn.setImageResource(R.drawable.treebranch_selected);
        }

        public void useVulture(View view){
            save_Password_Part_4("vulture");
            ImageButton btn = findViewById(R.id.imageButton32);
            btn.setImageResource(R.drawable.vulture_selected);
        }

}
