package com.example.ghada.quessplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText t;
    private String s;
    int number1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r=new Random();
        number1=r.nextInt(1000);


    }
    public void Guess(View v)
    {
        t=(EditText)findViewById(R.id.editText);
        s=t.getText().toString();

        if(number1== Integer.parseInt(s))
        {
            Toast.makeText(getApplicationContext(),"You Geuss the Number",Toast.LENGTH_LONG).show();
        }
        if(number1>Integer.parseInt(s))
        {
            Toast.makeText(getApplicationContext(),"The number greater than you entered",Toast.LENGTH_LONG).show();

        }
        if(number1<Integer.parseInt(s))
        {
            Toast.makeText(getApplicationContext(),"The number less than you entered",Toast.LENGTH_LONG).show();


        }


    }
}
