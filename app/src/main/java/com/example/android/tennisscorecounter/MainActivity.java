package com.example.android.tennisscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Tracks games won for Player A.
    int gameWinsByPlayerA = 0;

    //Tracks the remaining challenges for Player A.
    int challengeForPlayerA = 3;

    //Tracks games won for Player B.
    int gameWinsByPlayerB = 0;

    //Tracks the remaining challenges for Player B.
    int challengeForPlayerB = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Player A wins 1 points.
     */
    public void get15ForPlayerA(View v){

        displayScoreForPlayerA("15");
    }

    /**
     * Player A wins 2 points.
     */
    public void get30ForPlayerA(View v){

        displayScoreForPlayerA("30");
    }

    /**
     * Player A wins 3 points.
     */
    public void get40ForPlayerA(View v){

        displayScoreForPlayerA("40");
    }

    /**
     * Player A wins 4 points.
     */
    public void getAdForPlayerA(View v){

        displayScoreForPlayerA("AD");
    }

    /**
     * Player A wins a game.
     */
    public void gameForPlayerA(View v){
        gameWinsByPlayerA = gameWinsByPlayerA + 1;
        displayGamePlayerA(gameWinsByPlayerA);
        displayScoreForPlayerA("0");
        displayScoreForPlayerB("0");
    }

    /**
     * Player A uses a challenge.
     */
    public void challengeUsedForPlayerA(View v){
        challengeForPlayerA = challengeForPlayerA - 1;
        if (challengeForPlayerA < 0){
            challengeForPlayerA = 0;
        }
        displayMesChallengePlayerA("Challenges remaining:" + challengeForPlayerA);
    }

    /**
     * This method displays the given score for Player A on the screen.
     */
    private void displayScoreForPlayerA(String number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_a_player);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays a game for Player Aon the screen.
     */
    private void displayGamePlayerA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.game_a_player);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays challenges remaining for Player A on the screen.
     */
    private void displayMesChallengePlayerA(String number) {
        TextView quantityTextView = (TextView) findViewById(R.id.challenge_a_player);
        quantityTextView.setText("" + number);
    }

    /**
     * Player B wins 1 points.
     */
    public void get15ForPlayerB(View v){

        displayScoreForPlayerB("15");
    }

    /**
     * Player B wins 2 points.
     */
    public void get30ForPlayerB(View v){

        displayScoreForPlayerB("30");
    }

    /**
     * Player B wins 3 points.
     */
    public void get40ForPlayerB(View v){

        displayScoreForPlayerB("40");
    }

    /**
     * Player B wins 4 points.
     */
    public void getAdForPlayerB(View v){

        displayScoreForPlayerB("AD");
    }

    /**
     *Player B wins a game.
     */
    public void gameForPlayerB(View v){
        gameWinsByPlayerB = gameWinsByPlayerB + 1;
        displayGamePlayerB(gameWinsByPlayerB);
        displayScoreForPlayerA("0");
        displayScoreForPlayerB("0");
    }

    /**
     * Player B uses a challenge.
     */
    public void challengeUsedForPlayerB(View v){
        challengeForPlayerB = challengeForPlayerB - 1;
        if (challengeForPlayerB < 0){
            challengeForPlayerB = 0;
        }
        displayMesChallengePlayerB("Challenges remaining:" + challengeForPlayerB);
    }

    /**
     * This method displays the given score for Player B on the screen.
     */
    private void displayScoreForPlayerB(String number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_b_player);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays a game for Player B on the screen.
     */
    private void displayGamePlayerB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.game_b_player);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays challenges remaining for Player B on the screen.
     */
    private void displayMesChallengePlayerB(String number) {
        TextView quantityTextView = (TextView) findViewById(R.id.challenge_b_player);
        quantityTextView.setText("" + number);
    }

    /**
     * Reset all values.
     */
    public void resetAll(View v){
        gameWinsByPlayerA = 0;
        gameWinsByPlayerB = 0;
        challengeForPlayerA = 3;
        challengeForPlayerB = 3;
        displayScoreForPlayerA("0");
        displayScoreForPlayerB("0");
        displayGamePlayerA(gameWinsByPlayerA);
        displayGamePlayerB(gameWinsByPlayerB);
        displayMesChallengePlayerA("Challenges remaining:" + challengeForPlayerA);
        displayMesChallengePlayerB("Challenges remaining:" + challengeForPlayerB);
    }
}