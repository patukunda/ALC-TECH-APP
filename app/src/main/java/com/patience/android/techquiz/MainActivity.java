package com.patience.android.techquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity {

    // declaring the variables

    //initialising the quiz score to 0
    int quizScore = 0;
    //Declaring a variable for the name of the user who is taking the quiz
    String username;
    private boolean answer1; //declaring a variable to check if a correct answer for question 1 is selected
    private boolean answer2; //declaring a variable to check if a correct answer for question 2 is selected
    private boolean answer3; //declaring a variable to check if a correct answer for question 3 is selected
    private boolean answer4; //declaring a variable to check if a correct answer for question 4 is selected
    private boolean answer5; //declaring a variable to check if a correct answer for question 5 is selected
    private boolean answer6; //declaring a variable to check if a correct answer for question 6 is selected


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting the name of the user from the register activity using intent

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            username = extras.getString("gotUser");

            TextView welcome = (TextView) findViewById(R.id.user);

            welcome.setText("Welcome " + username);
        }
    }


    public void questionOne(View view) {

        // Checking if the button is checked

        boolean checked = ((android.widget.RadioButton) view).isChecked();


        // Check which radio button was clicked

        switch (view.getId()) {

            case R.id.compu:
                if (checked)

                    //Do Nothing this is a wrong answer
                break;
            case R.id.net:

                //Do Nothing this is a wrong answer
                break;

            case R.id.pop:
                if (checked)
                    // setting the value of answer 1 to ture because the ckecked button is the correct answer
                    answer3 = true;
                    break;

            case R.id.prog:
                if (checked)
                    //Do Nothing this is a wrong answer
                    break;
        }
    }


    public void questionTwo(View view) {
        // Is the button now checked?

        boolean checked = ((android.widget.RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.comp:
                if (checked)
                    //Do Nothing this is a wrong answer

                    break;
            case R.id.share:


                if (checked)
                    // setting the value of answer 2 to ture because the ckecked button is the correct answer
                    answer2 = true;

                break;


            case R.id.build:
                if (checked)
                    //Do Nothing this is a wrong answer
                    break;

            case R.id.boil:
                if (checked)
                    //Do Nothing this is a wrong answer
                    break;
        }
    }


    public void questionThree(View view) {
        // Is the button now checked?
        boolean checked = ((android.widget.RadioButton) view).isChecked();
        int count = 0;
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ad:
                if (checked)
                    // setting the value of answer 1 to ture because the ckecked button is the correct answer
                    answer1 = true;
                    break;

            case R.id.manufacturer:
                if (checked)
                    answer2 = false;
                    //Do Nothing this is a wrong answer
                    break;
            case R.id.location:
                if (checked)
                    answer3 = false;
                    //Do Nothing this is a wrong answer
                    break;
            case R.id.none:
                if (checked)
                    answer4 = false;
                    //Do Nothing this is a wrong answer
                    break;


        }
    }


    public void questionFour(View view) {
        // Is the button now checked?
        boolean checked = ((android.widget.RadioButton) view).isChecked();
        int count = 0;
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.lan:
                if (checked)
                    //Do Nothing this is a wrong answer
                    answer4 = true;
                    break;
            case R.id.man:

                if (checked)
                break;
            case R.id.san:
                if (checked)
                    break;
            case R.id.wan:
                if (checked)
                    break;


        }

    }

    public void questionFive(View view) {
        // action for checkbox click
        switch (view.getId()) {
            case R.id.home:
                answer5 = true;
                break;
            case R.id.wf:
                answer5 = true;
                break;
            case R.id.another:
                answer5 = true;
                break;
            case R.id.media:
                answer5 = false;
                break;
        }
    }

    public void questionSix(View view) {
        //Declare variables for the users answer and the correct answer
        String answered;
        String correctAnswer = "VoIP";


        EditText year = (EditText) findViewById(R.id.question6);

        //Get the users input from the EditText view
        answered = year.getText().toString();

        //Check if what the user answered is correct
        if (answered == correctAnswer) {
            answer6 = true;
        } else {

            answer6 = false;
        }

    }

    //Getting the total score by checking if the correct answers are selected
    public void getScore(View view) {

        if (answer1) {
            // if answer1 == true add 1 to the current score
            quizScore = quizScore + 1;
        }

        if (answer2) {
            // if answer2 == true add 1 to the current score
            quizScore = quizScore + 1;
        }

        if (answer3) {
            // if answer1 == true add 1 to the current score
            quizScore = quizScore + 1;
        }

        if (answer4) {
            // if answer1 == true add 1 to the current score
            quizScore = quizScore + 1;
        }
        if (answer5) {
            // if answer1 == true add 1 to the current score
            quizScore = quizScore + 1;
        }

        if (answer6) {
            // if answer1 == true add 1 to the current score
            quizScore = quizScore + 1;
        }

        //   show the user a toast message with there name and score
        Toast.makeText(MainActivity.this, "Hello " + username + " Your Quiz Score is " + quizScore, Toast.LENGTH_LONG).show();

    }
}
