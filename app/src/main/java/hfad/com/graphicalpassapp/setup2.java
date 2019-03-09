package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class setup2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup2);
    }


    public void getSetupPage_3(View view){
        Intent goToSetupScreen3 = new Intent(this, setup3.class);
        startActivity(goToSetupScreen3);
    }
}



