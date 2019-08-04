package com.abc.medidoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class channel_details extends AppCompatActivity {

    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel_details);

        btn2 = findViewById(R.id.updtbtn);
        btn3 = findViewById(R.id.button4);
        btn4 = findViewById(R.id.button5);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(channel_details.this,payment_details.class);
                startActivity(intent);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(channel_details.this,update_channel.class);
                startActivity(intent1);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(channel_details.this,"Successfully Deleted",Toast.LENGTH_SHORT).show();

              /* Intent intent2 = new Intent(channel_details.this,fragment_channel.class);
                startActivity(intent2);*/
            }
        });
    }
}
