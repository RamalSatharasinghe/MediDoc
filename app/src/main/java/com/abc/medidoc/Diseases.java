package com.abc.medidoc;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Diseases extends AppCompatActivity {
    Button but1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases);

        but1 = findViewById(R.id.button1);
  but1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent intent = new Intent(Diseases.this,DoctorList.class);
          startActivity(intent);
      }
  });
    }
}
