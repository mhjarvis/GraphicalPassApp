package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class passwordSetup0 extends Activity {

    public static final String EXTRA_MESSAGE = "loginText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_setup0);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = findViewById(R.id.loginText);
        messageView.setText(messageText);
    }
}
