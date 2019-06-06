package com.example.ejercicio_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.name);
        tv = findViewById(R.id.nameOutput);
    }

    public void sendMessage (View view){
        String n = etName.getText().toString();
        tv.setText(getString(R.string.hello)+" " + n + " " +getString(R.string.welcome));

    }

    public void clearMessage(View view){
        tv.setText("");
        etName.setText("");
    }
}
