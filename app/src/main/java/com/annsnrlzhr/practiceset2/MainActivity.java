package com.annsnrlzhr.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int ScoreA, ScoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScoreA = 0; ScoreB = 0;
    }

    public void displayTeamA(int number) {
        TextView teamAScoreView = (TextView) findViewById(R.id.teamA);
        teamAScoreView.setText(""+number);
    }

    public void plusThreeA(View view) {
        ScoreA += 3;
        displayTeamA(ScoreA);
    }
    public void plusTwoA(View view) {
        ScoreA += 2;
        displayTeamA(ScoreA);
    }
    public void freeThrowA(View view) {
        ScoreA += 1;
        displayTeamA(ScoreA);
    }
    public void displayTeamB(int number) {
        TextView teamBScoreView = (TextView) findViewById(R.id.teamB);
        teamBScoreView.setText(""+number);
    }

    public void plusThreeB(View view) {
        ScoreB += 3;
        displayTeamB(ScoreB);
    }
    public void plusTwoB(View view) {
        ScoreB += 2;
        displayTeamB(ScoreB);
    }
    public void freeThrowB(View view) {
        ScoreB += 1;
        displayTeamB(ScoreB);
    }

    public void reset(View view){
        ScoreA = 0;
        ScoreB = 0;
        displayTeamA(ScoreA);
        displayTeamB(ScoreB);
    }
}
