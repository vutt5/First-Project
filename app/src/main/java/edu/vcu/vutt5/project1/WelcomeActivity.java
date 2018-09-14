package edu.vcu.vutt5.project1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {
    //TextView object txtView created for the collection of the message from the mainActivity  screen,
TextView txtView, txtView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        txtView = (TextView) findViewById(R.id.textView6);
       txtView.setText("Welcome to the App! The app is LOCKED!");
// For collecting the message sent back from the mainActivity Creen.
        Bundle i = getIntent().getExtras();
        if (i != null) {
            //if the password was right then the text view will show the unlock message

            String value = i.getString("Pass");
            //  Toast.makeText(this, value, Toast.LENGTH_SHORT).show();

            txtView.setText(value);
        } else if (i == null) {
            //if nothing was sent then appear this message
            txtView.setText("Welcome to the App! The app is LOCKED!");

        }
        else {
            //if nothing was sent then appear this message
            txtView.setText("Welcome to the App! The app is LOCKED!");

        }





    }
//For the Unlock Button to go to the mainActivity screen when clicked.

    public void OnUnlock(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


}
