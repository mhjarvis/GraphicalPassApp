package hfad.com.graphicalpassapp;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //links to activity_main xml
    }

    // Login button - start login process
    public void getLogin(View view) {
        //EditText messageView = findViewById(R.id.loginText); //uncomment for User Name
        //String messageText = messageView.getText().toString(); //uncomment for User Name
        saveChoice("login");
        Intent goToLoginScreen0 = new Intent(this, login1.class); //create new intent
        //goToLoginScreen0.putExtra(login1.EXTRA_MESSAGE, messageText); //uncomment for User Name
        startActivity(goToLoginScreen0); //go to login1
    }

    // Setup button - start password setup
    public void setLogin(View view) {
        //EditText messageView = findViewById(R.id.loginText); //uncomment for User Name
        //String messageText = messageView.getText().toString(); //uncomment for User Name
        saveChoice("setup");
        Intent goToSetupScreen0 = new Intent(this, setup1.class); //create new intent
        //goToSetupScreen0.putExtra(setup1.EXTRA_MESSAGE, messageText); //uncomment for User Name
        startActivity(goToSetupScreen0); //go to setup1
    }

    //function called to remember user's choice on page 1
    public void saveChoice(String value){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE); //for accessing Shared Preferences for temp storage
        SharedPreferences.Editor editor = pref.edit();
        String key = "startingChoice"; //key name for reference
        editor.putString(key, value); //key/value combination - will save user's choice for later
        editor.apply(); //commit changes
    }
}

