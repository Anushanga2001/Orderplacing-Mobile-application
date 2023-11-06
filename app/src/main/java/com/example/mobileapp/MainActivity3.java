package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
// This interface done by IM/2020/012
public class MainActivity3 extends AppCompatActivity {

    private EditText[] editTexts = new EditText[6];
    private Button confirmButton;
    private Button anotherButton;
    private TextView errorTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editTexts[0] = findViewById(R.id.editTextText);
        editTexts[1] = findViewById(R.id.editTextText2);
        editTexts[2] = findViewById(R.id.editTextText3);
        editTexts[3] = findViewById(R.id.text5);
        editTexts[4] = findViewById(R.id.text6);
        editTexts[5] = findViewById(R.id.text7);

        confirmButton = findViewById(R.id.button3);

        confirmButton.setEnabled(false);

        errorTextView = findViewById(R.id.errorTextView);

        for (int i = 0; i < editTexts.length; i++) {
            editTexts[i].addTextChangedListener(textWatcher);
        }

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isFormValid()) {
                    Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                    intent.putExtra("text1", editTexts[0].getText().toString().trim());
                    intent.putExtra("text2", editTexts[1].getText().toString().trim());
                    intent.putExtra("text3", editTexts[2].getText().toString().trim());
                    intent.putExtra("text4", editTexts[3].getText().toString().trim());
                    intent.putExtra("text5", editTexts[4].getText().toString().trim());
                    intent.putExtra("text6", editTexts[5].getText().toString().trim());
                    startActivity(intent);
                } else {
                    showError("Please enter values for all input fields.");
                }
            }
        });

        anotherButton = findViewById(R.id.button);

        anotherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void afterTextChanged(Editable editable) {
            confirmButton.setEnabled(isFormValid());
        }
    };

    private boolean isFormValid() {
        for (int i = 0; i < editTexts.length; i++) {
            String input = editTexts[i].getText().toString().trim();
            if (input.isEmpty()) {
                return false;
            }
        }

        String phoneNumber = editTexts[3].getText().toString().trim();
        if (!isValidPhoneNumber(phoneNumber)) {
            showError("Phone number is not valid");
            return false;
        }

        errorTextView.setVisibility(View.GONE);

        return true;
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^0\\d{9}$");
    }

    private void showError(String errorMessage) {
        errorTextView.setText(errorMessage);
        errorTextView.setVisibility(View.VISIBLE);
    }
}
