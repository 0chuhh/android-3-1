package com.example.glava3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "scorpion", Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void buttonClick1(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "subzero", Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void buttonClick2(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "luekang", Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void buttonClick3(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "melena", Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void buttonClick4(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "raiden", Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void buttonClick5(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "jhony", Toast.LENGTH_SHORT);
        myToast.show();
    }
}