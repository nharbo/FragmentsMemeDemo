package com.example.nicolaiharbo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BottomPictureFragment extends Fragment {

    private static TextView topMemeText;
    private static TextView bottomMemeText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Vi skal lave et fragmentlayout før vi kan bruge det - derfor skal der laves en xlm fil først.
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);

        topMemeText = (TextView) view.findViewById(R.id.TopMemeText);
        bottomMemeText = (TextView) view.findViewById(R.id.BottomMemeText);

        return view;
    }

    public void setMemeText(String top, String bottom){
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);
    }
}
