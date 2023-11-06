package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.util.Calendar;
// This interface done by IM/2020/040
public class MainActivity4 extends AppCompatActivity {
    private TextView textViewa, textViewb, textViewc, textViewd, textViewe, textViewf, textViewg, textViewh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());

        TextView textViewDate = findViewById(R.id.editTextDate);
        textViewDate.setText(currentDate);

        // Retrieve input values from the intent
        Intent intent = getIntent();

        String input1 = intent.getStringExtra("input1");
        String input2 = intent.getStringExtra("input2");
        String input3 = intent.getStringExtra("input3");
        String input4 = intent.getStringExtra("input4");


        TextView textView3 = findViewById(R.id.t2);
        TextView textView6 = findViewById(R.id.t5); // Replace with the actual ID
        TextView textView9 = findViewById(R.id.t8); // Replace with the actual ID
        TextView textView12 = findViewById(R.id.t11); // Replace with the actual IDc

        textView3.setText(input1 != null && !input1.isEmpty() ? input1 : "0");
        textView6.setText(input2 != null && !input2.isEmpty() ? input2 : "0");
        textView9.setText(input3 != null && !input3.isEmpty() ? input3 : "0");
        textView12.setText(input4 != null && !input4.isEmpty() ? input4 : "0");


        // Check if input values are not null before working with them
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;

        try {
            if (input1 != null) {
                // Parse input1 as an integer and multiply by 80
                result1 = Integer.parseInt(input1) * 80;
            }
        } catch (NumberFormatException e) {
            // Handle the exception, e.g., display an error message
        }

        try {
            if (input2 != null) {
                // Parse input2 as an integer and multiply by 100
                result2 = Integer.parseInt(input2) * 100;
            }
        } catch (NumberFormatException e) {
            // Handle the exception, e.g., display an error message
        }

        try {
            if (input3 != null) {
                // Parse input3 as an integer and multiply by 70
                result3 = Integer.parseInt(input3) * 70;
            }
        } catch (NumberFormatException e) {
            // Handle the exception, e.g., display an error message
        }

        try {
            if (input4 != null) {
                // Parse input4 as an integer and multiply by 60
                result4 = Integer.parseInt(input4) * 60;
            }
        } catch (NumberFormatException e) {
            // Handle the exception, e.g., display an error message
        }

        // Find the TextViews where you want to display the results
        TextView resultTextView1 = findViewById(R.id.t3);
        TextView resultTextView2 = findViewById(R.id.t6);
        TextView resultTextView3 = findViewById(R.id.t9);
        TextView resultTextView4 = findViewById(R.id.t12);

        // Set the results in the TextViews
        resultTextView1.setText(String.valueOf(result1));
        resultTextView2.setText(String.valueOf(result2));
        resultTextView3.setText(String.valueOf(result3));
        resultTextView4.setText(String.valueOf(result4));


        Button buttonToActivityA = findViewById(R.id.button5);
        Button buttonToActivityB = findViewById(R.id.button7);

        buttonToActivityA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start ActivityA
                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);

                // Start ActivityA
                startActivity(intent);
            }
        });

        textViewa = findViewById(R.id.t2);
        textViewb = findViewById(R.id.t3);
        textViewc = findViewById(R.id.t5);
        textViewd = findViewById(R.id.t6);
        textViewe = findViewById(R.id.t8);
        textViewf = findViewById(R.id.t9);
        textViewg = findViewById(R.id.t11);
        textViewh = findViewById(R.id.t12);

        buttonToActivityB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1 = textViewa.getText().toString();
                String text2 = textViewb.getText().toString();
                String text3 = textViewc.getText().toString();
                String text4 = textViewd.getText().toString();
                String text5 = textViewe.getText().toString();
                String text6 = textViewf.getText().toString();
                String text7 = textViewg.getText().toString();
                String text8 = textViewh.getText().toString();

                // Create an Intent to start the DisplayActivity
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                // Pass the values as extras to the DisplayActivity
                intent.putExtra("text1", text1);
                intent.putExtra("text2", text2);
                intent.putExtra("text3", text3);
                intent.putExtra("text4", text4);
                intent.putExtra("text5", text5);
                intent.putExtra("text6", text6);
                intent.putExtra("text7", text7);
                intent.putExtra("text8", text8);
                startActivity(intent);
            }
        });

    }

}
