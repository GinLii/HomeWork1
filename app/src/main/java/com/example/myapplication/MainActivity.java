package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText= findViewById(R.id.edit1);
        final Button btn = findViewById(R.id.button1);
        final TextView tv = findViewById(R.id.text1);
        final CheckBox answer =findViewById(R.id.Box1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String inputText=editText.getText().toString();
                tv.setText(inputText);
                if(answer.isChecked()){
                    Toast.makeText(MainActivity.this, "谢谢老师！", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}