package hfad.com.graphicalpassapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class storage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);


        //get user choice from main_activity
        String userChoice = getCon("startingChoice");

        if(userChoice.equals("login")){
            String mas = retrievePassword(); //retrieves the stored password
            String log = createLogin(); //build login password chosen
            String test = testPassword(mas, log); //test wether the passwords match and store result in 'test'
            testIt(test); //send value to output screen
        } else if(userChoice.equals("setup")){
            String storeMe = createPassword();
            storeMasterPassword(storeMe);
            testIt("the password has been stored");
        }
        //pull value from page 1 choice
        //route based on value



        useBunny2();
        useBunny3();
        useBunny4();
        test1();
        test2();
        test3();
        test4();

        createLogin();
        createPassword();
        retrievePassword(); //pull and print password to storage activity screen for testing

        String t1 = rp1();
        String t2 = rp2();

        //String answer = testPassword(t1, t2);
        //testIt(answer);

        //if (answer.equals("Passwords Match")){

        //}
    }

    //Create password chosen by user to login (to match to stored password)
    public String createLogin() {
        String a = getCon("test_password_key_part_1"); //retrieve 1st value chosen
        String b = getCon("test_password_key_part_2"); //retrieve 2nd value chosen
        String c = getCon("test_password_key_part_3"); //retrieve 3rd value chosen
        String d = getCon("test_password_key_part_4"); //retrieve 4th value chosen

        String final_pass = ""; //variable to hold password to test
        final_pass = final_pass.concat(a + b + c + d); //combine all values into string

        TextView total = findViewById(R.id.con); //find field in xml
        total.setText(final_pass); //set text value to pass (TESTING ONLY)
        attempt_password(final_pass); //test password

        return final_pass;
    }

    //Create password chosen during Setup Password (to store)
    public String createPassword() {

        String e = getCon("password_key_part_1"); //retrieve 1st value chosen during setup
        String f = getCon("password_key_part_2"); //retrieve 2nd value chosen during setup
        String g = getCon("password_key_part_3"); //retrieve 3rd value chosen during setup
        String h = getCon("password_key_part_4"); //retireve 4th value chosen during setup

        String store_pass = ""; //variable to hold password to test
        store_pass = store_pass.concat(e + f + g + h); //combine all values into string

        TextView total = (TextView) findViewById(R.id.pass); //find field in xml
        total.setText(store_pass); //set text value to pass (TESTING ONLY)
        storeMasterPassword(store_pass); //saves attempt to preferences

        return store_pass;
    }

    //Retrieve stored password value
    public String retrievePassword(){
        String master;

        master = getCon("master_password");

        TextView total = (TextView) findViewById(R.id.printMasterPassword);
        total.setText(master);
        return master;
    }

    public void storeMasterPassword(String value){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String key = "master_password";
        editor.putString(key, value); //
        editor.apply(); //commit changes
    }


















    public String testPassword(String var, String var2){
        if(var.equals(var2)){
            return "Passwords Match";
        } else {
            return "Incorrect Password";
        }
    }


        public void testIt(String a){

        TextView total = (TextView) findViewById(R.id.doesitwork);
        total.setText(a);
        }






    public String rp1(){
        String m;
        m = getCon("master_password");
        return m;
    }
    public String rp2(){
        String n;
        n = getCon("attempt_password");
        return n;
    }


//function to retrieve set values from storage
        public String getCon(String mykey){

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String phrase=pref.getString(mykey, null);
        return phrase;
        }




        //save the createPassword to Shared Preferences


    public void attempt_password(String value){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        String key = "attempt_password";
        editor.putString(key, value); //
        editor.apply(); //commit changes
    }













    /*public void useBunny() {
        TextView total = (TextView) findViewById(R.id.passwordpart1);
        total.setText(printName()); //call printName function to retrieve values
    }

    /* FUNCTION TO RETRIEVE STORED VALUE (for testing here) */
    /*public String printName() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);  //start shared preferences
        SharedPreferences.Editor editor = pref.edit();
        String phrase=pref.getString("password_key_part_1", null); //variable 'phrase' holds value of key_name5
        String pass1intro = "Password Part 1: ";
        phrase = pass1intro + phrase;
        return phrase;  //return value to 'useElephant()'

    } */

    public void useBunny2() {
        TextView total = (TextView) findViewById(R.id.passwordpart2);
        total.setText(printName2()); //call printName function to retrieve values
    }
    public String printName2() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);  //start shared preferences
        SharedPreferences.Editor editor = pref.edit();
        String phrase=pref.getString("password_key_part_2", null); //variable 'phrase' holds value of key_name5
        String pass1intro = "Password Part 2: ";
        phrase = pass1intro + phrase;
        return phrase;  //return value to 'useElephant()'

    }

    public void useBunny3() {
        TextView total = (TextView) findViewById(R.id.passwordpart3);
        total.setText(printName3()); //call printName function to retrieve values
    }
    public String printName3() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);  //start shared preferences
        SharedPreferences.Editor editor = pref.edit();
        String phrase=pref.getString("password_key_part_3", null); //variable 'phrase' holds value of key_name5
        String pass3intro = "Password Part 3: ";
        phrase = pass3intro + phrase;
        return phrase;  //return value

    }

    public void useBunny4() {
        TextView total = (TextView) findViewById(R.id.passwordpart4);
        total.setText(printName4()); //call printName function to retrieve values
    }
    public String printName4() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);  //start shared preferences
        SharedPreferences.Editor editor = pref.edit();
        String phrase=pref.getString("password_key_part_4", null); //variable 'phrase' holds value of key_name5
        String pass4intro = "Password Part 4: ";
        phrase = pass4intro + phrase;
        return phrase;  //return value

    }

    public void test1() {
        TextView total = (TextView) findViewById(R.id.testpasswordpart1);
        total.setText(testPrintName()); //call printName function to retrieve values
    }

    /* FUNCTION TO RETRIEVE STORED VALUE (for testing here) */
    public String testPrintName() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);  //start shared preferences
        SharedPreferences.Editor editor = pref.edit();
        String phrase=pref.getString("test_password_key_part_1", null); //variable 'phrase' holds value of key_name5
        String pass1intro = "Password Part 1: ";
        phrase = pass1intro + phrase;
        return phrase;  //return value to 'useElephant()'

    }

    public void test2() {
        TextView total = (TextView) findViewById(R.id.testpasswordpart2);
        total.setText(testPrintName2()); //call printName function to retrieve values
    }

    /* FUNCTION TO RETRIEVE STORED VALUE (for testing here) */
    public String testPrintName2() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);  //start shared preferences
        SharedPreferences.Editor editor = pref.edit();
        String phrase = pref.getString("test_password_key_part_2", null); //variable 'phrase' holds value of key_name5
        String pass1intro = "Password Part 2: ";
        phrase = pass1intro + phrase;
        return phrase;  //return value to 'useElephant()'
    }

    //test3
    public void test3() {
        TextView total = (TextView) findViewById(R.id.testpasswordpart3);
        total.setText(testPrintName3()); //call printName function to retrieve values
    }

    /* FUNCTION TO RETRIEVE STORED VALUE (for testing here) */
    public String testPrintName3() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);  //start shared preferences
        SharedPreferences.Editor editor = pref.edit();
        String phrase = pref.getString("test_password_key_part_3", null); //variable 'phrase' holds value of key_name5
        String pass1intro = "Password Part 3: ";
        phrase = pass1intro + phrase;
        return phrase;  //return value to 'useElephant()'
    }

    //test4
    public void test4() {
        TextView total = (TextView) findViewById(R.id.testpasswordpart4);
        total.setText(testPrintName4()); //call printName function to retrieve values
    }

    /* FUNCTION TO RETRIEVE STORED VALUE (for testing here) */
    public String testPrintName4() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);  //start shared preferences
        SharedPreferences.Editor editor = pref.edit();
        String phrase = pref.getString("test_password_key_part_4", null); //variable 'phrase' holds value of key_name5
        String pass1intro = "Password Part 4: ";
        phrase = pass1intro + phrase;
        return phrase;  //return value to 'useElephant()'
    }


    //use button to pull up note-taking activity
    public void getNotes(View view){
        Intent goToNotes = new Intent(this, notes.class);
        startActivity(goToNotes);
    }
}
