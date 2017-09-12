package com.example.txmarc.buttonclicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playerOne = (Button) findViewById((R.id.buttonOne));
        Button playerTwo = (Button) findViewById((R.id.buttonTwo));

        // Set a clicklistener on the view
        playerOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity

            }
        });

        // Set a clicklistener on the view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity

            }
        });
    }
}
