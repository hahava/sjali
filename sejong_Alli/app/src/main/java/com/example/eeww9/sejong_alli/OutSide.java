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

@SuppressLint("ValidFragment")
public class OutSide extends Fragment {
    Context mContext;
    Switch outOnOff;
    View view = null;
    ExampleDetails exampleDetails[] = new ExampleDetails[4];
    //Example adding
    private ListView MenuList = null;
    private CustomListviewAdapter ListViewAdapter = null;

    public OutSide(Context context) {
        mContext = context;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (view == null)
            view = inflater.inflate(R.layout.out_side, null);

        // Switch 버튼 함수
        outOnOff = (Switch) view.findViewById(R.id.outSwitch);
        outOnOff.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(mContext.getApplicationContext(), "Out Push On", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(mContext.getApplicationContext(), "Out Push Off", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Example adding
        MenuList = (ListView) view.findViewById(R.id.outList);
        ListViewAdapter = new CustomListviewAdapter(getActivity());
        MenuList.setAdapter(ListViewAdapter);

        ListViewAdapter.addItem(getResources().getDrawable(R.drawable.out_one, null),
                "스토리, 세대를 잇다!",
                "~ 2016_12_30");
        ListViewAdapter.addItem(getResources().getDrawable(R.drawable.out_second, null),
                "보안 취약점, 자동분석 아이디어! 공모전",
                "~ 2017_01_22");

        ListViewAdapter.addItem(getResources().getDrawable(R.drawable.out_third, null),
                "2016 경북 스토리콘텐츠 공모전",
                "~ 2017_01_10");
        ListViewAdapter.addItem(getResources().getDrawable(R.drawable.out_fourth, null),
                "레진코믹스 세계만화공모전!",
                "~ 2017_02_28");
        ListViewAdapter.addItem(getResources().getDrawable(R.drawable.out_fivth, null),
                "서울백병원 개원 85주년 UCC 공모전",
                "~ 2017_03_31");
        return view;
    }

}
