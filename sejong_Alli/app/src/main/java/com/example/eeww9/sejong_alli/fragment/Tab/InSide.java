package com.example.eeww9.sejong_alli.fragment.Tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.example.eeww9.sejong_alli.CustomListviewAdapter;
import com.example.eeww9.sejong_alli.R;

public class InSide extends Fragment {
	private View view;
	private ListView MenuList;
	private CustomListviewAdapter ListViewAdapter;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		if (view == null) {
			view = inflater.inflate(R.layout.in_side, null);
		}

		//Example
		MenuList = (ListView)view.findViewById(R.id.inList);
		ListViewAdapter = new CustomListviewAdapter(getActivity());
		MenuList.setAdapter(ListViewAdapter);

		ListViewAdapter.addItem(getResources().getDrawable(R.drawable.out_one, null),
			"스토리, 세대를 잇다!",
			"~ 2016_12_30");

		return view;
	}
}
