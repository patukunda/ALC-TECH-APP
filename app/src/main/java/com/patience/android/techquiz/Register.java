package com.patience.android.techquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.awt.font.TextAttribute;

public class Register extends Activity {

    public String user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    //Get the current User's Username

    public void getUser (View view) {

        EditText username = (EditText) findViewById(R.id.user);

         user = username.getText().toString();

         //if(user ==""){


        // } else {

             //   Toast toast = Toast.makeText(Register.this, "Hello " + user, Toast.LENGTH_LONG);

             // toast.show();

             Intent goHome = new Intent(this, MainActivity.class);
             goHome.putExtra("gotUser", user);

             startActivity(goHome);

        // }
    }
/*
    public void saveUser (String username){

        username = user;

        getUsername(username);

    }
    */



}
