package com.example.eeww9.sejong_alli.fragment.Tab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;
import com.example.eeww9.sejong_alli.*;

import java.util.ArrayList;

@SuppressLint("ValidFragment")
public class Group extends Fragment{
    Context mContext;
    Switch groupOnOff;
    View view;
    ArrayList<DetailAdding> arr=new ArrayList<DetailAdding>();
    DetailAdding di=new DetailAdding();
    DetailParser parser;

    //Example adding
    private ListView MenuList = null;
    private CustomListviewAdapter ListViewAdapter = null;

    public Group(Context context){
        mContext = context;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(view==null){
			view = inflater.inflate(R.layout.group, null);
		}

        //Example
        MenuList=(ListView) view.findViewById(R.id.groupList);
        ListViewAdapter = new CustomListviewAdapter(getActivity());
        MenuList.setAdapter(ListViewAdapter);
        parser=new DetailParser();
        //floating Button
//        new JsoupAsyncTask().execute(null,null,null);

        FloatingActionButton ftb = (FloatingActionButton) view.findViewById(R.id.fab);
        ftb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,WriteGroup.class);
                startActivity(intent);
            }
        });


        return view;

    }
//    // 제목, 원하는 인원수, 내용, 토의주제, 이름(발의자), 전공 // 소그룹 ,핸드폰 번호
//    public class JsoupAsyncTask extends AsyncTask<String, String,  ArrayList<DetailAdding>> {
//        protected void onPreExecute(String... params){
//            super.onPreExecute();
//        }
//
//        public ArrayList<DetailAdding> doInBackground(String... params){
//
//            return parser.connectFest();
//        }
//
//        protected void onPostExecute (ArrayList<DetailAdding> result) {
//           // 리스트뷰 여기에 구현하시면 됩니다.
//        }
//    }


}
