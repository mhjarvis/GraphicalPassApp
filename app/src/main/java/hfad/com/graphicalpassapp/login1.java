package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class login1 extends Activity {

    public static final String EXTRA_MESSAGE = "loginText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = findViewById(R.id.loginText);
        messageView.setText(messageText);
    }

    // go to next set of images (2 of 4)
    public void getLoginPage_2(View view){
        Intent goToLoginScreen1 = new Intent(this, login2.class);
        startActivity(goToLoginScreen1);
    }
}
