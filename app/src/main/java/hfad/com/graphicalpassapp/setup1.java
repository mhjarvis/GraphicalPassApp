package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class setup1 extends Activity {

    public static final String EXTRA_MESSAGE = "loginText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup1);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = findViewById(R.id.loginText);
        messageView.setText(messageText);
    }

    public void getSetupPage_2(View view){
        Intent goToSetupScreen2 = new Intent(this, setup2.class);
        startActivity(goToSetupScreen2);
    }
}
