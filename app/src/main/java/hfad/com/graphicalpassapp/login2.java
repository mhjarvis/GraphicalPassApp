package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class login2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    // go to next set of images (2 of 4)
    public void getLoginPage_3(View view){
        Intent goToLoginScreen2 = new Intent(this, login3.class);
        startActivity(goToLoginScreen2);
    }
}
