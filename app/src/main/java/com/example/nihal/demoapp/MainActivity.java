package com.example.nihal.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText dollarEditText = findViewById(R.id.dollarEditText);
        Double dollarAmountDouble = Double.parseDouble(dollarEditText.getText().toString());

        Double rupeesAmount = dollarAmountDouble * 63;


        TextView textView = (TextView) findViewById(R.id.rupeesEditText);
        textView.setText("₹"+rupeesAmount);

        Log.i("Username", dollarEditText.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
