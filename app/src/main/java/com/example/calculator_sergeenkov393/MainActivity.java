package com.example.calculator_sergeenkov393;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Максим Сергеенков 393 калькулятор
    EditText ta;
    EditText tb;
    TextView lr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.editTextNumberA);
        tb = findViewById(R.id.editTextNumberB);
        lr = findViewById(R.id.textViewOutResult);
    }

    public void action(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();
        float a = 0;
        float b = 0;
        try
        {
            a = Float.parseFloat(sa);
            b = Float.parseFloat(sb);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "Введите значение", Toast.LENGTH_SHORT).show();
        }
        float c = 0;
        switch (v.getId())
        {
            case R.id.buttonAdd:
                c = a + b;
                break;
            case R.id.buttonSubtraction:
                c = a - b;
                break;
            case R.id.buttonMultiplication:
                c = a * b;
                break;
            case R.id.buttonDivision:
                c = a / b;
                break;
        }
        String sc = String.valueOf(c);
        lr.setText(sc);
    }
}