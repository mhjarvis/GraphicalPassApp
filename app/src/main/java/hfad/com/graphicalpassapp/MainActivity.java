package hfad.com.graphicalpassapp;

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
        Intent goToLoginScreen0 = new Intent(this, login1.class); //create new intent
        //goToLoginScreen0.putExtra(login1.EXTRA_MESSAGE, messageText); //uncomment for User Name
        startActivity(goToLoginScreen0); //go to login1
    }

    // Setup button - start password setup
    public void setLogin(View view) {
        //EditText messageView = findViewById(R.id.loginText); //uncomment for User Name
        //String messageText = messageView.getText().toString(); //uncomment for User Name
        Intent goToSetupScreen0 = new Intent(this, setup1.class); //create new intent
        //goToSetupScreen0.putExtra(setup1.EXTRA_MESSAGE, messageText); //uncomment for User Name
        startActivity(goToSetupScreen0); //go to setup1
    }
}

