package com.authentification.khalidbaba.authentification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by khalidbaba on 28/01/2018.
 */

public class WolcomeActivity extends Activity {
    TextView Email;
    String _email;

    //TODO : Declare all variables (TextView, String)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //TODO : Instantiate all objects
        Intent i = getIntent();
        _email = i.getStringExtra("Email");
        Email = (TextView) findViewById(R.id.email);

        Email.setText(_email);



        //TODO  : Get the intent content and show the Email in the TextView
    }
}
