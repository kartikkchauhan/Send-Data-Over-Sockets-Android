package com.example.sockets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText) findViewById(R.id.msgBox);
    }

    public void sendMsg(View view)
    {
        Toast.makeText(this, "Function is running", Toast.LENGTH_SHORT).show();
        MessegeSender messegeSender =new MessegeSender();
        messegeSender.execute(editText.getText().toString());
    }



}
