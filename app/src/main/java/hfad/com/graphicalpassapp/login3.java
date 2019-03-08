package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class login3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);
    }

    // go to next set of images (4 of 4)
    public void getLoginPage_4(View view) {
        Intent goToLoginScreen4 = new Intent(this, login4.class);
        startActivity(goToLoginScreen4);
    }
}
