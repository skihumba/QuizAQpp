package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //initialize public score variable
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //this method checks if q1 is correct
    public int checkQ1() {
        RadioButton Q1a = (RadioButton) findViewById(R.id.a1b);
        boolean Q1Ok = Q1a.isChecked();

        if (Q1Ok) {
            return score = score + 1;
        }
        return score;
    }

    //this method checks if q2 is correct
    public int checkQ2() {
        CheckBox Q2a = (CheckBox) findViewById(R.id.a2b);
        boolean Q2Ok = Q2a.isChecked();

        if (Q2Ok) {
            return score = score + 1;
        }
        return score;
    }

    //this method checks if q3 is correct
    public int checkQ3 (){
        TextView q3TextView = (TextView) findViewById(R.id.a3);
        String q3Ans = q3TextView.getText().toString();

       if (q3Ans.equals("true")) {
           score = score + 1;
       }
       return score;
    }

    public int checkQ4() {
        RadioButton Q4a = (RadioButton) findViewById(R.id.a4a);
        boolean Q4Ok = Q4a.isChecked();

        if (Q4Ok) {
            return score = score + 1;
        }
        return score;
    }

    //this method is called when the submit button is clicked
    public void getScore(View view) {
        checkQ1();
        checkQ2();
        checkQ3();
        checkQ4();
        Toast.makeText(this, String.format("Your score is " + score), Toast.LENGTH_SHORT).show();
    }

}
