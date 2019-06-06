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
    CheckBox checkSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.name);
        tv = findViewById(R.id.nameOutput);
        checkSelect = findViewById(R.id.check);
    }

    public void sendMessage(View view) {
        String n = etName.getText().toString();
        if (checkSelect.isChecked()) {
            tv.setText(getString(R.string.hello) + " " + n + " " + getString(R.string.welcome) + " " + getString(R.string.checked));
        } else {
            tv.setText(getString(R.string.hello) + " " + n + " " + getString(R.string.welcome) + " " + getString(R.string.unchecked));

        }

    }

    public void clearMessage(View view) {
        tv.setText("");
        etName.setText("");
    }

}



