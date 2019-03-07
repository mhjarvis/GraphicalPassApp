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

    public void getLogin(View view) {
        EditText messageView = findViewById(R.id.loginText);
        String messageText = messageView.getText().toString();
        Intent goToLoginScreen0 = new Intent(this, passwordLogin0.class);
        goToLoginScreen0.putExtra(passwordLogin0.EXTRA_MESSAGE, messageText);
        startActivity(goToLoginScreen0);
    }

    public void setLogin(View view) {
        EditText messageView = findViewById(R.id.loginText);
        String messageText = messageView.getText().toString();
        Intent goToSetupScreen0 = new Intent(this, passwordSetup0.class);
        goToSetupScreen0.putExtra(passwordSetup0.EXTRA_MESSAGE, messageText);
        startActivity(goToSetupScreen0);
    }
}