package com.example.android.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class Playervsplayer extends AppCompatActivity {

    private Button posA;
    private Button posB;
    private Button posC;
    private Button posD;
    private Button posE;
    private Button posF;
    private Button posG;
    private Button posH;
    private Button posI;

    public String playerTwoLetter;

    public String playerOneLetter;

    public int goingFirst;

    public int turn;

    private Button playerTwoChoice;

    private Button playerOneChoice;

    private int xScore;

    private int oScore;

    private int drawScore;

    private int plays;

    private boolean xWin;

    private boolean oWin;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3x3);

        posA = findViewById(R.id.posA);
        posB = findViewById(R.id.posB);
        posC = findViewById(R.id.posC);
        posD = findViewById(R.id.posD);
        posE = findViewById(R.id.posE);
        posF = findViewById(R.id.posF);
        posG = findViewById(R.id.posG);
        posH = findViewById(R.id.posH);
        posI = findViewById(R.id.posI);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            goingFirst = extras.getInt("key");
        }


        /**Take the value of goingFirst gotten from the previous activity and assign it to turn**/
        turn = goingFirst;

        playerOneLetter = "X";
        playerTwoLetter = "O";

        /**onClick listener to define what happens when the square at [1,1] is clicked**/
        posA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (turn == 1){
                    posA.setText(playerOneLetter);
                    playerOneChoice = posA;
                    playerOneChoice.setClickable(false);
                    turn = 2;
                    checkWinner();
                    plays++;
                } else if (turn == 2){
                    posA.setText(playerTwoLetter);
                    playerTwoChoice = posA;
                    playerTwoChoice.setClickable(false);
                    turn = 1;
                    checkWinner();
                    plays++;
                }


            }
        });

        /**onClick listener to define what happens when the square at [1,2] is clicked**/
        posB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (turn == 1){
                    posB.setText(playerOneLetter);
                    playerOneChoice = posB;
                    playerOneChoice.setClickable(false);
                    turn = 2;
                    checkWinner();
                    plays++;
                } else if (turn == 2){
                    posB.setText(playerTwoLetter);
                    playerTwoChoice = posB;
                    playerTwoChoice.setClickable(false);
                    turn = 1;
                    checkWinner();
                    plays++;
                }

            }
        });

        /**onClick listener to define what happens when the square at [1,3] is clicked**/
        posC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (turn == 1){
                    posC.setText(playerOneLetter);
                    playerOneChoice = posC;
                    playerOneChoice.setClickable(false);
                    turn = 2;
                    checkWinner();
                    plays++;
                } else if (turn == 2){
                    posC.setText(playerTwoLetter);
                    playerTwoChoice = posC;
                    playerTwoChoice.setClickable(false);
                    turn = 1;
                    checkWinner();
                    plays++;
                }

            }
        });

        /**onClick listener to define what happens when the square at [2,1] is clicked**/
        posD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (turn == 1){
                    posD.setText(playerOneLetter);
                    playerOneChoice = posD;
                    playerOneChoice.setClickable(false);
                    turn = 2;
                    checkWinner();
                    plays++;
                } else if (turn == 2){
                    posD.setText(playerTwoLetter);
                    playerTwoChoice = posD;
                    playerTwoChoice.setClickable(false);
                    turn = 1;
                    checkWinner();
                    plays++;
                }

            }
        });

        /**onClick listener to define what happens when the square at [2,2] is clicked**/
        posE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (turn == 1){
                    posE.setText(playerOneLetter);
                    playerOneChoice = posE;
                    playerOneChoice.setClickable(false);
                    turn = 2;
                    checkWinner();
                    plays++;
                } else if (turn == 2){
                    posE.setText(playerTwoLetter);
                    playerTwoChoice = posE;
                    playerTwoChoice.setClickable(false);
                    turn = 1;
                    checkWinner();
                    plays++;
                }

            }
        });

        /**onClick listener to define what happens when the square at [2,3] is clicked**/
        posF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (turn == 1){
                posF.setText(playerOneLetter);
                playerOneChoice = posF;
                playerOneChoice.setClickable(false);
                turn = 2;
                checkWinner();
                plays++;
            } else if (turn == 2){
                posF.setText(playerTwoLetter);
                playerTwoChoice = posF;
                playerTwoChoice.setClickable(false);
                turn = 1;
                checkWinner();
                plays++;
            }

            }
        });

        /**onClick listener to define what happens when the square at [3,1] is clicked**/
        posG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (turn == 1){
                    posG.setText(playerOneLetter);
                    playerOneChoice = posG;
                    playerOneChoice.setClickable(false);
                    turn = 2;
                    checkWinner();
                    plays++;
                } else if (turn == 2){
                    posG.setText(playerTwoLetter);
                    playerTwoChoice = posG;
                    playerTwoChoice.setClickable(false);
                    turn = 1;
                    checkWinner();
                    plays++;
                }

            }
        });

        /**onClick listener to define what happens when the square at [3,2] is clicked**/
        posH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 1){
                    posH.setText(playerOneLetter);
                    playerOneChoice = posH;
                    playerOneChoice.setClickable(false);
                    turn = 2;
                    checkWinner();
                    plays++;
                } else if (turn == 2){
                    posH.setText(playerTwoLetter);
                    playerTwoChoice = posH;
                    playerTwoChoice.setClickable(false);
                    turn = 1;
                    checkWinner();
                    plays++;
                }

            }
        });

        /**onClick listener to define what happens when the square at [3,3] is clicked**/
        posI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (turn == 1){
                    posI.setText(playerOneLetter);
                    playerOneChoice = posI;
                    playerOneChoice.setClickable(false);
                    turn = 2;
                    checkWinner();
                    plays++;
                } else if (turn == 2){
                    posI.setText(playerTwoLetter);
                    playerTwoChoice = posI;
                    playerTwoChoice.setClickable(false);
                    turn = 1;
                    checkWinner();
                    plays++;
                }

            }
        });

        xScore = 0;
        oScore = 0;
        drawScore = 0;
        plays = 0;
    }

    /**Method to check if the winner of the round is 'x' or 'o'. The output is used in
    * the checkWinner method**/
    public void whoWin(){
        if ((posA.getText().equals("X")&&posB.getText().equals("X")&&posC.getText().equals("X"))
                || (posD.getText().equals("X")&&posE.getText().equals("X")&&posF.getText().equals("X"))
                || (posG.getText().equals("X")&&posH.getText().equals("X")&&posI.getText().equals("X"))
                || (posA.getText().equals("X")&&posE.getText().equals("X")&&posI.getText().equals("X"))
                || (posC.getText().equals("X")&&posE.getText().equals("X")&&posG.getText().equals("X"))
                || (posA.getText().equals("X")&&posD.getText().equals("X")&&posG.getText().equals("X"))
                || (posB.getText().equals("X")&&posE.getText().equals("X")&&posH.getText().equals("X"))
                || (posC.getText().equals("X")&&posF.getText().equals("X")&&posI.getText().equals("X"))){
            xWin = true;
            turn = 0;
        } else if ((posA.getText().equals("O")&&posB.getText().equals("O")&&posC.getText().equals("O"))
                || (posD.getText().equals("O")&&posE.getText().equals("O")&&posF.getText().equals("O"))
                || (posG.getText().equals("O")&&posH.getText().equals("O")&&posI.getText().equals("O"))
                || (posA.getText().equals("O")&&posE.getText().equals("O")&&posI.getText().equals("O"))
                || (posC.getText().equals("O")&&posE.getText().equals("O")&&posG.getText().equals("O"))
                || (posA.getText().equals("O")&&posD.getText().equals("O")&&posG.getText().equals("O"))
                || (posB.getText().equals("O")&&posE.getText().equals("O")&&posH.getText().equals("O"))
                || (posC.getText().equals("O")&&posF.getText().equals("O")&&posI.getText().equals("O"))){
            oWin = true;
            turn = 0;
        }
    }

    /**Uses the whoWin method to collect the value of oWin and xWin and executes based on those values**/
    public void checkWinner(){
        whoWin();
        if (xWin){
            xScore++;
            TextView x = findViewById(R.id.xData);
            x.setText(String.valueOf(xScore));
        } else if (oWin){
            oScore++;
            TextView o = findViewById(R.id.oData);
            o.setText(String.valueOf(oScore));
        }
        else if (plays == 8 && turn != 0){
            drawScore++;
            TextView draw = findViewById(R.id.drawData);
            draw.setText(String.valueOf(drawScore));
        }

    }

    /**Method to clear the content of the game board while keeping game history**/
    public void clearBoard(View view){

        posA.setText("");
        posB.setText("");
        posC.setText("");
        posD.setText("");
        posE.setText("");
        posF.setText("");
        posG.setText("");
        posH.setText("");
        posI.setText("");

        posA.setClickable(true);
        posB.setClickable(true);
        posC.setClickable(true);
        posD.setClickable(true);
        posE.setClickable(true);
        posF.setClickable(true);
        posG.setClickable(true);
        posH.setClickable(true);
        posI.setClickable(true);

        xWin = false;
        oWin = false;

        turn = goingFirst;

        plays = 0;
    }


    /**Method to clear the content of the game board along with the game history**/
    public void resetGame(View view){

        posA.setText("");
        posB.setText("");
        posC.setText("");
        posD.setText("");
        posE.setText("");
        posF.setText("");
        posG.setText("");
        posH.setText("");
        posI.setText("");

        posA.setClickable(true);
        posB.setClickable(true);
        posC.setClickable(true);
        posD.setClickable(true);
        posE.setClickable(true);
        posF.setClickable(true);
        posG.setClickable(true);
        posH.setClickable(true);
        posI.setClickable(true);

        xScore = 0;
        TextView x = findViewById(R.id.xData);
        x.setText(String.valueOf(xScore));

        oScore = 0;
        TextView o = findViewById(R.id.oData);
        o.setText(String.valueOf(oScore));

        drawScore = 0;
        TextView draw = findViewById(R.id.drawData);
        draw.setText(String.valueOf(drawScore));

        xWin = false;
        oWin = false;

        turn = goingFirst;

        plays = 0;
    }

}
