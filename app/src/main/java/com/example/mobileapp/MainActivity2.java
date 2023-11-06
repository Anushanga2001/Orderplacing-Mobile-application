package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
// This interface done by IM/2020/064
public class MainActivity2 extends AppCompatActivity {
    private EditText editText1, editText2, editText3, editText4;

    public MainActivity2() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        editText1 = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);
        editText3 = findViewById(R.id.editTextNumber3);
        editText4 = findViewById(R.id.editTextNumber4);

        Button nextButton = findViewById(R.id.button6);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Gather input values
                String input1 = editText1.getText().toString();
                String input2 = editText2.getText().toString();
                String input3 = editText3.getText().toString();
                String input4 = editText4.getText().toString();

                // Create an Intent to start the display interface
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                intent.putExtra("input1", input1);
                intent.putExtra("input2", input2);
                intent.putExtra("input3", input3);
                intent.putExtra("input4", input4);
                startActivity(intent);
            }
        });

        // Find the button by its ID
        Button buttonToAnotherActivity = findViewById(R.id.button4);

        // Add a click listener to the button
        buttonToAnotherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);

                // Start the new activity
                startActivity(intent);
            }
        });
    }
}
