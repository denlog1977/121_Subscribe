package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textViewEmailMessage = (TextView) findViewById(R.id.textViewMessage);
        final EditText editTextName = (EditText) findViewById(R.id.editTextName);
        final EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        final EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        Button buttonOK = (Button) findViewById(R.id.buttonOK);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String javaFormatString  =  getString(R.string.subscribeOK);
                String  substitutedString  =  String.format(javaFormatString, editTextName.getText(),  editTextEmail.getText());
//                textViewEmailMessage.setText(getString(R.string.subscribeOK) + editTextName.getText() + getString(R.string.emailText) + editTextEmail.getText());
                textViewEmailMessage.setText(substitutedString);
            }
        });

        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewEmailMessage.setText("");
                editTextName.setText("");
                editTextEmail.setText("");
                editTextPassword.setText("");
            }
        });

    }
}