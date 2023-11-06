package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Calendar;

// This interface done by IM/2020/016
public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Intent intent = getIntent();
        String text1 = intent.getStringExtra("text1");
        String text2 = intent.getStringExtra("text2");
        String text3 = intent.getStringExtra("text3");
        String text4 = intent.getStringExtra("text4");
        String text5 = intent.getStringExtra("text5");
        String text6 = intent.getStringExtra("text6");
        String text7 = intent.getStringExtra("text7");
        String text8 = intent.getStringExtra("text8");

        // Find the TextView elements in the DisplayActivity layout
        TextView displayTextView1 = findViewById(R.id.t2);
        TextView displayTextView2 = findViewById(R.id.t3);
        TextView displayTextView3 = findViewById(R.id.t5);
        TextView displayTextView4 = findViewById(R.id.t6);
        TextView displayTextView5 = findViewById(R.id.t8);
        TextView displayTextView6 = findViewById(R.id.t9);
        TextView displayTextView7 = findViewById(R.id.t11);
        TextView displayTextView8 = findViewById(R.id.t12);

        // Set the retrieved values in the TextView elements of DisplayActivity
        displayTextView1.setText(text1);
        displayTextView2.setText(text2);
        displayTextView3.setText(text3);
        displayTextView4.setText(text4);
        displayTextView5.setText(text5);
        displayTextView6.setText(text6);
        displayTextView7.setText(text7);
        displayTextView8.setText(text8);

        // Convert the values to integers and perform addition

        int num2 = Integer.parseInt(text2);

        int num4 = Integer.parseInt(text4);

        int num6 = Integer.parseInt(text6);

        int num8 = Integer.parseInt(text8);

        int total =  num2 +  num4 + num6 +  num8;

        // Display the total in another TextView
        TextView totalTextView = findViewById(R.id.textView29);
        totalTextView.setText(String.valueOf(total));

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());

        TextView textViewDate = findViewById(R.id.editTextDate2);
        textViewDate.setText(currentDate);

        Button buttonToAnotherActivity = findViewById(R.id.button8);
        buttonToAnotherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
                // Start the new activity
                startActivity(intent);
            }
        });
    }
}
