package com.example.android.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {


public int goingFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button play = findViewById(R.id.play_btn);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Playervsplayer.class);
                myIntent.putExtra("key", goingFirst);
                //Calling to intent to open MainActivity.
                startActivity(myIntent);
            }
        });

        proceed();
    }

    /**Method to handle the selection of 'x'**/
    public void xClick(View view){
        goingFirst = 1;
        proceed();
    }

    /**Method to handle the selection of 'o'**/
    public void oClick(View view){
        goingFirst = 2;
        proceed();
    }


/** method to check whether either 'x' or 'o' have been selected by the player.
 If not, they cant press play and continue to the next activity**/
    public void proceed() {
        RadioButton optionX = findViewById(R.id.option_x);
        RadioButton optionO = findViewById(R.id.option_o);
        Button play = findViewById(R.id.play_btn);

        if(optionX.isChecked() || optionO.isChecked()) {
            play.setClickable(true);
        } else {
            play.setClickable(false);
        }
    }
}

