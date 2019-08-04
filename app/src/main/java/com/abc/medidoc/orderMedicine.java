package com.abc.medidoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class orderMedicine extends AppCompatActivity {


    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_medicine);


        btn1 = (Button) findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(orderMedicine.this,"Submitted Successfully",Toast.LENGTH_SHORT).show();

                Intent i1 = new Intent(orderMedicine.this,medicineDis.class);
                startActivity(i1);


            }
        });
    }
}
