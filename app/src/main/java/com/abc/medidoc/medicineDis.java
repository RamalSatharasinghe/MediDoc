package com.abc.medidoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class medicineDis extends AppCompatActivity {


    Button btn,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_dis);

        btn = (Button) findViewById(R.id.button6);
        btn2 = (Button) findViewById(R.id.button7);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i1 =new Intent(medicineDis.this,medicineUpdate.class);

                startActivity(i1);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(medicineDis.this,"Deleted Successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
