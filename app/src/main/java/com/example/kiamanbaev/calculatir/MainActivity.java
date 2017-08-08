package com.example.kiamanbaev.calculatir;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultText;
    private EditText editA;
    private EditText editB;
    private Button plusButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        plusButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                int a = Integer.parseInt(editA.getText().toString());
                int b = Integer.parseInt(editB.getText().toString());
                int c = a + b;
                resultText.setText(String.valueOf(c));
            }
        });
    }


    private void init(){
        resultText = (TextView) findViewById(R.id.resView);
        editA = (EditText)findViewById(R.id.editA);
        editB = (EditText)findViewById(R.id.editB);
        plusButton = (Button) findViewById(R.id.plusButton);
    }
}
