package com.abc.medidoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class medicineUpdate extends AppCompatActivity {

    Button bt1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_update);


        bt1 = (Button) findViewById(R.id.button3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(medicineUpdate.this,"Updated Successfully",Toast.LENGTH_SHORT).show();

                Intent i1 = new Intent(medicineUpdate.this,medicineDis.class);
                startActivity(i1);
            }
        });
    }
}
