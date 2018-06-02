package com.badani.registerform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnRegister;
    private EditText firstName;
    private EditText lastName;
    private EditText phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initControl();
        initControlListener();
    }

    private void initControl() {

        btnRegister = (Button) findViewById(R.id.btnRegister);
        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        phone = (EditText) findViewById(R.id.phone);
    }

    private void initControlListener() {

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "hi" + firstName.getText() + " " + lastName.getText(),
                        Toast.LENGTH_LONG).show();
            }
        });

    }


}
