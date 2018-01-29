package com.authentification.khalidbaba.authentification;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by khalidbaba on 28/01/2018.
 */


public class MainActivity extends Activity {

    // TODO : declare all variables (elements AND variables)

    EditText Email;
    EditText password;
    Button btn_register;

    String _email;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //TODO Instantiate object (EditText and Button)

        Email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        btn_register = (Button) findViewById(R.id.btnLogin);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _email= Email.getText().toString();
                Log.i("btn_register","button register click");
                Intent i = new Intent(MainActivity.this, WolcomeActivity.class);
                i.putExtra("Email",_email);
                startActivity(i);

            }
        });



        //TODO : handle click listener in button and get values from the editText


        //TODO : Create Intent and send email content to the welcome_activity



    }
}
