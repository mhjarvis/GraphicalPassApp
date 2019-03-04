package hfad.com.graphicalpassapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getLogin(View view){
        Intent goToLoginScreen0 = new Intent(this, passwordLogin0.class);
        startActivity(goToLoginScreen0);
    }

    public void setLogin(View view){
        Intent goToSetupScreen0 = new Intent(this, passwordSetup0.class);
        startActivity(goToSetupScreen0);
    }


}
