package com.example.Signupactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {

    private Button signOutBtn;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mAuth = FirebaseAuth.getInstance();

        signOutBtn = findViewById(R.id.logout);
        signOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity(new Intent(HomeActivity.this , SignInActivity.class));
                finish();
            }
        });
    }

    public void GamePertama(View view) {
        Intent intent=new Intent(HomeActivity.this,game1.class);
        startActivity(intent);
    }

    public void GameKedua(View view) {
        Intent intent=new Intent(HomeActivity.this,game2.class);
        startActivity(intent);
    }

    public void cekpoint(View view) {
        Intent intent=new Intent(HomeActivity.this,tukarpoint.class);
        startActivity(intent);
    }

}