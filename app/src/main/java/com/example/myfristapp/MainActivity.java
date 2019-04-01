package com.example.myfristapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtOne = (EditText) findViewById(R.id.txtOne);
                EditText txtTwo = (EditText) findViewById(R.id.txtTwo);
                TextView txtvResult = (TextView) findViewById(R.id.txtvResult);

                int num1 = Integer.parseInt(txtOne.getText().toString());
                int num2 = Integer.parseInt(txtTwo.getText().toString());
                int result = num1 + num2;
                txtvResult.setText(result);
            }
        });

    }
}
