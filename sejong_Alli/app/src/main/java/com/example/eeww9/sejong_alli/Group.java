package com.example.eeww9.sejong_alli;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.app.Activity;

@SuppressLint("ValidFragment")
public class Group extends Fragment{
    Context mContext;

    public Group(Context context){
        mContext = context;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.group, null);
        return view;
    }
}
