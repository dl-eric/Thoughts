package com.codeday.thoughts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.parse.Parse;

public class AccountActivity extends AppCompatActivity {

    private boolean isParseInitialized = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_account);

        if(!isParseInitialized) {
            Parse.initialize(this, "amWtu0dCB9xx0XJ8a4dQA4cy7XayDikxCGpdhkVb", "0XbZemPscEidvvl1NE0wrCKXQayuS48Fr7I6XF4O");
            isParseInitialized = true;
        }
    }

    public void toLoginActivity(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void toRegisterActivity(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
