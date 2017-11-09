package com.example.whiske.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int scoreOfA = 0;
    private int scoreOfB = 0;

    protected void buttonOnClick(View view) {
        switch (view.getId()) {
            // for reset button
            case R.id.reset_button:
                scoreOfA = 0;
                scoreOfB = 0;
                displayScoreA(scoreOfA);
                displayScoreB(scoreOfB);
                break;
            // for  TeamA
            case R.id.buttonA1:
                scoreOfA = get1point(scoreOfA);
                displayScoreA(scoreOfA);
                break;

            case R.id.buttonA2:
                scoreOfA = get2point(scoreOfA);
                displayScoreA(scoreOfA);
                break;

            case R.id.buttonA3:
                scoreOfA = get3point(scoreOfA);
                displayScoreA(scoreOfA);
                break;
            // for TeamB

            case R.id.buttonB1:
                scoreOfB = get1point(scoreOfB);
                displayScoreB(scoreOfB);
                break;

            case R.id.buttonB2:
                scoreOfB = get2point(scoreOfB);
                displayScoreB(scoreOfB);
                break;

            case R.id.buttonB3:
                scoreOfB = get3point(scoreOfB);
                displayScoreB(scoreOfB);
                break;
        }
    }

    private int get3point(int point) {
        point = point + 3;
        return point;
    }

    private int get2point(int point) {
        point = point + 2;
        return point;
    }

    private int get1point(int point) {
        point = point + 1;
        return point;
    }

    private void displayScoreA(int number) {
        TextView scoreA = (TextView) findViewById(R.id.scoreA);
        scoreA.setText("" + number);
    }

    private void displayScoreB(int number) {
        TextView scoreB = (TextView) findViewById(R.id.scoreB);
        scoreB.setText("" + number);
    }

}
