package com.example.medical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvResult = findViewById(R.id.textViewResult);
//        String result1= getIntent().getStringExtra("result");
//        tvResult.setText(result1);
        tvResult.setText("You can face some heart problem");
    }

    public void findDoctor(View view) {
        Intent intent = new Intent(this,FindDoctorActivity.class);
        startActivity(intent);
        finish();
    }
}