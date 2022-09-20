package com.example.konvero;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editTextNumberDecimal;
    private EditText editTextNumberDecimal2;
    private TextView textView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView6=findViewById(R.id.textView6);
        editTextNumberDecimal=findViewById(R.id.editTextNumberDecimal);
        editTextNumberDecimal2=findViewById(R.id.editTextNumberDecimal2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"App by Abhinav",Toast.LENGTH_SHORT).show();
                String s= editTextNumberDecimal.getText().toString();
                float m = Float.parseFloat(s);
                String s1=editTextNumberDecimal2.getText().toString();
                float kg = Float.parseFloat(s1);
                float bmi = kg/(m*m);
                textView6.setText("Your BMI SCORE IS : " + String.format("%.2f",bmi));

            }
        });


    }
}