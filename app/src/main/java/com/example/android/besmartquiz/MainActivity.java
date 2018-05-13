package com.example.android.besmartquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // For Question 1
    RadioButton question1_choice3;
    // For Question 2
    RadioButton question2_choice3;
    // For Question 3
    CheckBox question3_choice1;
    CheckBox question2_choice2;
    CheckBox question3_choice3;
    CheckBox question3_choice4;

    // For Question 4
    RadioButton question4_choice4;
    // For Question 5

    RadioButton question5_choice1;
    // For Question 6

    RadioButton question6_choice1;
    // For Question 7
    CheckBox question7_choice1;
    CheckBox question7_choice2;
    CheckBox question7_choice3;
    CheckBox question7_choice4;
    // For Question 8
    RadioButton question8_choice3;
    // For Question 9
    RadioButton question9_choice3;

    // For Question 10
    RadioButton question10_choice4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }


    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_choice3));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int final_score;


        // For Question 1 - Correct Answer is #3 "is an annual developer conference."

        Boolean answer1;

        question1_choice3 = (RadioButton) this.findViewById(R.id.question1_choice3);
        answer1 = question1_choice3.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        // For Question 2 - Correct Answer is #3 "2008"

        Boolean answer2;
        question2_choice3 = (RadioButton) this.findViewById(R.id.question2_choice3);
        answer2 = question2_choice3.isChecked();

        if (answer2) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        // For Question 3  - Correct Answers are #1 "Android Oreo" and #2 "Google AI"
        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        Boolean answer3_choice4;
        question3_choice1 = (CheckBox) this.findViewById(R.id.question3_choice1);
        question2_choice2 = (CheckBox) this.findViewById(R.id.question3_choice2);
        question3_choice3 = (CheckBox) this.findViewById(R.id.question3_choice3);
        question3_choice4 = (CheckBox) this.findViewById(R.id.question3_choice4);
        answer3_choice1 = question3_choice1.isChecked();
        answer3_choice2 = question2_choice2.isChecked();
        answer3_choice3 = question3_choice3.isChecked();
        answer3_choice4 = question3_choice4.isChecked();
        if (answer3_choice1 && answer3_choice2 && !answer3_choice3 && !answer3_choice4) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        // For Question 4 - Correct Answer is #4 "8 May 2018"

        Boolean answer4;
        question4_choice4 = (RadioButton) this.findViewById(R.id.question4_choice4);
        answer4 = question4_choice4.isChecked();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        // For Question 5  - Correct Answers is #1 "Mountain View,California"

        Boolean answer5;
        question5_choice1 = (RadioButton) this.findViewById(R.id.question5_choice1);
        answer5 = question5_choice1.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        // For Question 6 - Correct Answer is #1 "3"

        Boolean answer6;
        question6_choice1 = (RadioButton) this.findViewById(R.id.question6_choice1);
        answer6 = question6_choice1.isChecked();
        if (answer6) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }

        // For Question 7  - Correct Answers are #3 "Android P" and #4 "Material Design 2.0"

        Boolean answer7_choice1;
        Boolean answer7_choice2;
        Boolean answer7_choice3;
        Boolean answer7_choice4;
        question7_choice1 = (CheckBox) this.findViewById(R.id.question7_choice1);
        question7_choice2 = (CheckBox) this.findViewById(R.id.question7_choice2);
        question7_choice3 = (CheckBox) this.findViewById(R.id.question7_choice3);
        question7_choice4 = (CheckBox) this.findViewById(R.id.question7_choice4);
        answer7_choice1 = question7_choice1.isChecked();
        answer7_choice2 = question7_choice2.isChecked();
        answer7_choice3 = question7_choice3.isChecked();
        answer7_choice4 = question7_choice4.isChecked();
        if (!answer7_choice1 && !answer7_choice2 && answer7_choice3 && answer7_choice4) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        // For Question 8 - Correct Answer is #3 "4"

        Boolean answer8;
        question8_choice3 = (RadioButton) this.findViewById(R.id.question8_choice3);
        answer8 = question8_choice3.isChecked();
        if (answer8) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }

        // For Question 9  - Correct Answers is #3 "2015"

        Boolean answer9;
        question9_choice3 = (RadioButton) this.findViewById(R.id.question9_choice3);
        answer9 = question9_choice3.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }

        // For Question 10 - Correct Answer is #4 "2016"

        Boolean answer10;
        question10_choice4 = (RadioButton) this.findViewById(R.id.question10_choice4);
        answer10 = question10_choice4.isChecked();
        if (answer10) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }

        // For Final Score

        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

        if (final_score == 10) {
            resultsDisplay = "Perfect! You scored 10 out of 10";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}