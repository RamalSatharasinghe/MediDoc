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

public class ChannelFragment extends Fragment {

    Activity context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        context=getActivity();
        return inflater.inflate(R.layout.activity_fragment_channel,container,false);



    }


    @Override
    public void onStart() {
        super.onStart();
        Button bt=(Button)context.findViewById(R.id.btn1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context, fragment_signin.class);
                startActivity(intent);

            }
        });
    }
}
