package com.abc.medidoc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LoginFragment extends Fragment {
    Activity context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        context=getActivity();
        return inflater.inflate(R.layout.activity_login,container,false);
    }

  public void onStart(){
        super.onStart();
        Button regBtn = (Button)context .findViewById(R.id.registerbtn);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,Register.class);
                startActivity(intent);
            }
        });

        Button forgBtn = (Button)context.findViewById(R.id.forgotbtn);
        forgBtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              Intent intent1 = new Intent(context,forgotpassword.class);
              startActivity(intent1);
          }
      });

        Button loginBtn = (Button)context.findViewById(R.id.loginbtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              Intent intent2 = new Intent(context,profile.class);
              startActivity(intent2);
          }
      });





   }


}




