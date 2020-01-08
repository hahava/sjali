package com.example.eeww9.sejong_alli.fragment.Tab;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.example.eeww9.sejong_alli.CustomListviewAdapter;
import com.example.eeww9.sejong_alli.R;
import com.example.eeww9.sejong_alli.WriteGroup;

public class ThirdView extends Fragment {

	private View tabInnerView;
	private ListView groups;
	private CustomListviewAdapter listViewAdapter;
	private FloatingActionButton groupAddBtn;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		if (tabInnerView == null) {
			tabInnerView = inflater.inflate(R.layout.group, null);
		}

		groups = (ListView)tabInnerView.findViewById(R.id.groupList);
		listViewAdapter = new CustomListviewAdapter(getActivity());
		groups.setAdapter(listViewAdapter);

		groupAddBtn = (FloatingActionButton)tabInnerView.findViewById(R.id.fab);
		groupAddBtn.setOnClickListener(v -> {
			Intent intent = new Intent(v.getContext(), WriteGroup.class);
			startActivity(intent);
		});

		return tabInnerView;
	}

}
