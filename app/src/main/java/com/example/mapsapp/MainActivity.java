package com.example.mapsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {
    private Button login_button,signin_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        login_button = findViewById(R.id.login_button);
        login_button.setOnClickListener(this);

        signin_button = findViewById(R.id.signin_button);
        signin_button.setOnClickListener(this);

    }

    private void openRegisterScreen() {
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
    private void openUserMainScreen() {
        Intent intent_userscreen = new Intent(this,MapsActivity.class);
        startActivity(intent_userscreen);
    }

    @Override
    public void onClick(View v) {
        if(v == login_button){;
            Log.i("click","clicked");
            openUserMainScreen();
        }else if(v == signin_button){
            openRegisterScreen();
        }
    }

}
