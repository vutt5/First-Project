package edu.vcu.vutt5.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Set password for the activity
    String Password = "1234";
    // string variable Input created to collect the password pressed from the user
    String Input = "";
    // String variable UnlockMessage created to store the messages that needed to be sent back to the welcome screen.
    String UnlockMessage = " Welcome to the App! The App is LOCKED!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//put in the value of 1 when user click button number 1.
    public void Onclick1(View view){ Input = Input+"1"; }
// put in the value of 2 when user click button number 2.
    public void Onclick2(View view){ Input = Input+"2"; }
// put in the value of 3 when user click button number 3.
    public void Onclick3(View view){ Input = Input+"3"; }
// put in the value of 4 when user click button number 4.
    public void Onclick4(View view){ Input = Input+"4"; }
//method for submit button.
    public void Onclick5(View view){
//check to see if the entered password is the same with the implimented password to send appropriate message back to the welcomescreen
        if(Password.equals(Input)){
            UnlockMessage = " Welcome to the App! The App is UNLOCKED!";
        }
        else{
            UnlockMessage = " Welcome to the App! The App is LOCKED!";
        }
//Intent to carry the message back to the welcomescreen and also go back to the main screen.
        Intent i = new Intent(this, WelcomeActivity.class);
        i.putExtra("Pass", UnlockMessage);
        startActivity(i);
    }

}
