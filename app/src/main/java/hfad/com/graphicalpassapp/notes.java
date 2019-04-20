package hfad.com.graphicalpassapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class notes extends AppCompatActivity {

    EditText myNotes; //creates edible text

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes); //link to xml sheet
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //floating action button changed to save notes
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Save("notesPage.txt");
            }
        });
        
        myNotes = (EditText) findViewById(R.id.EditText1); //assign find value
        myNotes.setText(Open("notesPage.txt")); //opens appropriate file when loaded
    }

    //Retrieve Notes Page for display after login
    public String Open(String fileName) {
        String content = "";
        //if file exists attempt to open it
        if (FileExists(fileName)) {
            try {
                InputStream in = openFileInput(fileName);
                //if no file exists
                if ( in != null) {
                    InputStreamReader tmp = new InputStreamReader( in ); //create new
                    BufferedReader reader = new BufferedReader(tmp);
                    String str;
                    StringBuilder buf = new StringBuilder();
                    while ((str = reader.readLine()) != null) {
                        buf.append(str + "\n");
                    } in .close();
                    content = buf.toString();
                }
            } catch (java.io.FileNotFoundException e) {} catch (Throwable t) {
                Toast.makeText(this, "Exception: " + t.toString(), Toast.LENGTH_LONG).show();
            }
        }
        return content;
    }

    public boolean FileExists(String fileExist) {
        File file = getBaseContext().getFileStreamPath(fileExist);
        return file.exists();
    }
    //function to save current version of the page
    public void Save(String fileName) {
        try {
            OutputStreamWriter out =
                    new OutputStreamWriter(openFileOutput(fileName, 0));
            out.write(myNotes.getText().toString());
            out.close();
            Toast.makeText(this, "File Saved!", Toast.LENGTH_SHORT).show(); //flash that the file has been saved
        } catch (Throwable t) {
            Toast.makeText(this, "Error: " + t.toString(), Toast.LENGTH_LONG).show(); //in the event of error
        }
    }

}
