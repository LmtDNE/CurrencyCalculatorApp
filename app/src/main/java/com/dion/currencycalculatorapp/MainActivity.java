package com.dion.currencycalculatorapp;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public void clickFunction (View view) {

        EditText userInput = (EditText) findViewById(R.id.inputMoney);
        String conversion = userInput.getText().toString();
        double inputConvert = Double.parseDouble(conversion);
        double finalConvert = inputConvert *  0.90975;
        String finalC = String.format("%.2f", finalConvert);
        Log.d("Conversion", finalC);

        Toast.makeText(getApplicationContext(), "Euros: €" + finalC, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
