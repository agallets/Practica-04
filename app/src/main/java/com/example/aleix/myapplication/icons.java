package com.example.aleix.myapplication;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;


class iconos extends Fragment implements View.OnClickListener{

    View parentView;
    chargeimg MiCallBack;

    public iconos() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        parentView = inflater.inflate(R.layout.fragment_icons, container, false);
        parentView.findViewById(R.id.caticon).setOnClickListener(this);
        parentView.findViewById(R.id.dogicon).setOnClickListener(this);
        parentView.findViewById(R.id.reindeericon).setOnClickListener(this);

        return parentView;
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);

        MiCallBack = (chargeimg) activity;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id) {
            case R.id.caticon:
                MiCallBack.detectarBoton("1");
                break;
            case R.id.dogicon:
                MiCallBack.detectarBoton("2");
                break;
            case R.id.reindeericon:
                MiCallBack.detectarBoton("3");
                break;
        }
    }
}
