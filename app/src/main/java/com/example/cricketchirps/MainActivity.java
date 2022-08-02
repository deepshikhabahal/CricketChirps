package com.example.cricketchirps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        formatter= new DecimalFormat("#0.0");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter the number of chirps", Toast.LENGTH_SHORT).show();
                } else {

                    int chirps = Integer.parseInt(editText.getText().toString().trim());

                    double temp = ((chirps / 3.0) + 4);
                    String text = "The approx temperature outside " +
                            "is " + formatter.format(temp) + " degrees Celsius";

                    textView.setText(text);
                }
            }
        });
    }
}