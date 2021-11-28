package com.example.first_try;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
    private Button login_button;
    private EditText username_EditText;
    private EditText password_EditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username_EditText = findViewById(R.id.username_text);
        password_EditText = findViewById(R.id.password_text);

        //login button implementation
        login_button = findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = username_EditText.getText().toString();
                String password = password_EditText.getText().toString();
                //SENT THE DATA TO DB AND RECEIVE CLEARANCE
            }
        });

    }
}
