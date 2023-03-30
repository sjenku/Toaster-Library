package com.example.toasterexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toasterlibrary.ElementView;
import com.example.toasterlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.s(this,"one");
    }
}