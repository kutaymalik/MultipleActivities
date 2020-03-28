package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String userName;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText2 = findViewById(R.id.editText2);

        userName = "";
    }

    public void changeActivity(View view){

        userName = editText2.getText().toString();

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);

        intent.putExtra("userInput",userName);

        startActivity(intent);

    }
}
