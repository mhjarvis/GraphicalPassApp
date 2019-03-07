package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class passwordLogin0 extends Activity {

    public static final String EXTRA_MESSAGE = "loginText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_login0);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = findViewById(R.id.loginText);
        messageView.setText(messageText);
    }
}
