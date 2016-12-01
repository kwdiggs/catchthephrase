package com.diggs.keenan.catchphraseadfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startPracticeRound(View view) {
        Intent intent = new Intent(this, GameplayActivity.class);
        intent.putExtra("practice_round", true);
        startActivity(intent);
    }

    public void startNewGame(View view) {
        Intent intent = new Intent(this, GameplayActivity.class);
        startActivity(intent);
    }

    public void showInstructions(View view) {
        Intent intent = new Intent(this, InstructionActivity.class);
        startActivity(intent);
    }

    public void testScoreboard (View view) {
        Intent intent = new Intent(this, ScoreboardActivity.class);
        startActivity(intent);
    }
}
