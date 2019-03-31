package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class setup4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup4);
    }

    public void getStorage(View view){
        Intent goToStorage = new Intent(this, storage.class);
        startActivity(goToStorage);
    }
}
