package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class setup3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup3);
    }


    public void getSetupPage_4(View view){
        Intent goToSetupScreen4 = new Intent(this, setup4.class);
        startActivity(goToSetupScreen4);
    }
}
