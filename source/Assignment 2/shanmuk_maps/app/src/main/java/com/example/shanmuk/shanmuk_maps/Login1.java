package com.example.shanmuk.shanmuk_maps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import android.widget.TextView;

import com.example.shanmuk.myapplication.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import com.example.shanmuk.shanmuk_maps.MapsActivity;

public class Login1 extends AppCompatActivity {


    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    }



    public void checkCredentials(View v) {
        EditText usernameCtrl = (EditText) findViewById(R.id.editText);
        EditText passwordCtrl = (EditText) findViewById(R.id.editText2);
        TextView errorText = (TextView) findViewById(R.id.passerror);
        String userName = usernameCtrl.getText().toString();
        String password = passwordCtrl.getText().toString();

        boolean validationFlag = false;

        if (!userName.isEmpty() && !password.isEmpty()) {
            if (userName.equals("username") && password.equals("password")) {
                validationFlag = true;

            }
        }
        if (!validationFlag) {
            errorText.setVisibility(View.VISIBLE);
        } else {

            Intent redirect = new Intent(Login1.this, MapsActivity.class);
            startActivity(redirect);
        }

    }
    }


