package com.example.aleix.myapplication;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
class imagenes extends Fragment {

    View parentView;

    public imagenes() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        parentView = inflater.inflate(R.layout.fragment_images, container, false);

        // Inflate the layout for this fragment
        return parentView;
    }


    public void recibirBoton(String msg) {

        switch (msg){
            case "1":
                parentView.setBackgroundResource(R.drawable.catfigure);
                break;
            case "2":
                parentView.setBackgroundResource(R.drawable.dogfigure);
                break;
            case "3":
                parentView.setBackgroundResource(R.drawable.reindeerfigure);
                break;
        }
    }
}
