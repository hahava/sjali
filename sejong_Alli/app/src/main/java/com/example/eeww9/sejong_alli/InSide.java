package com.example.eeww9.sejong_alli;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.eeww9.sejong_alli.example.CustomListviewAdapter;

@SuppressLint("ValidFragment")
public class InSide extends Fragment{
    Context mContext;
    Switch inOnOff;
    View view;
    //Example adding
    private ListView MenuList = null;
    private CustomListviewAdapter ListViewAdapter = null;

    public InSide(Context context){
        mContext = context;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
       if(view==null)
        view = inflater.inflate(R.layout.in_side, null);

        inOnOff = (Switch) view.findViewById(R.id.inSwitch);
        inOnOff.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText( mContext.getApplicationContext(),"In Push On",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText( mContext.getApplicationContext(),"In Push Off",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Example
        MenuList=(ListView) view.findViewById(R.id.inList);
        ListViewAdapter = new CustomListviewAdapter(getActivity());
        MenuList.setAdapter(ListViewAdapter);

        ListViewAdapter.addItem(getResources().getDrawable(R.drawable.out_one, null),
                   "스토리, 세대를 잇다!",
                   "~ 2016_12_30");


        return view;
    }
}
