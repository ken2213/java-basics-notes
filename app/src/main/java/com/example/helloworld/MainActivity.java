package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myBTN = findViewById(R.id.myBtn);

        myBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This code will be executed when the button is clicked

//                Toast.makeText(MainActivity.this,
//                        "You Clicked the Button",
//                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}