package com.example.fritt.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



/**
 * Created by fritt on 2016/12/30.
 */

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Intent intent=getIntent();
        final String data=intent.getStringExtra("extra_data");
        Log.d("helloworld", data);
        Log.d("helloworld","Branch1");
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
        Button button2= (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data_return","hello,MainActivity,get your message:"+data);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}