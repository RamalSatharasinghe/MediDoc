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

public class loginkFragment extends Fragment {
    Activity context;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context=getActivity();
        return inflater.inflate(R.layout.activity_login_k,container,false);
    }

    @Override
    public void onStart() {
        super.onStart();

        Button loginBtn = (Button)context.findViewById(R.id.lgbtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,EditPro.class);
                startActivity(intent);
            }
        });
    }
}

