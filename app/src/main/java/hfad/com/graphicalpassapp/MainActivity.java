package hfad.com.graphicalpassapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // go to login page 1 (1 of 4)
    public void getLogin(View view) {
        EditText messageView = findViewById(R.id.loginText);
        String messageText = messageView.getText().toString();
        Intent goToLoginScreen0 = new Intent(this, login1.class);
        goToLoginScreen0.putExtra(login1.EXTRA_MESSAGE, messageText);
        startActivity(goToLoginScreen0);
    }

    // go to setup page to create password (1 of 4)
    public void setLogin(View view) {
        EditText messageView = findViewById(R.id.loginText);
        String messageText = messageView.getText().toString();
        Intent goToSetupScreen0 = new Intent(this, setup1.class);
        goToSetupScreen0.putExtra(setup1.EXTRA_MESSAGE, messageText);
        startActivity(goToSetupScreen0);
    }
}