package com.example.yuanyuanlai.legalapp.Login;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yuanyuanlai.legalapp.R;

public class LoginActivity extends AppCompatActivity {

    public static Intent newIntent(Context context){
        Intent intent=new Intent( context,LoginActivity.class );
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
