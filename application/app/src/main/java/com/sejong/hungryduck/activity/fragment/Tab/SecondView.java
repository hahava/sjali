package com.sejong.hungryduck.activity.fragment.Tab;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.sejong.hungryduck.activity.StudyGroupWritingActivity;
import com.sejong.hungryduck.sejong.R;
import com.sejong.hungryduck.viewadapter.PostingsListviewAdapter;

public class SecondView extends Fragment {

	private View tabInnerView;
	private ListView groups;
	private PostingsListviewAdapter listViewAdapter;
	private FloatingActionButton groupAddBtn;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		if (tabInnerView == null) {
			tabInnerView = inflater.inflate(R.layout.activity_studygroup_list, null);
		}

		groups = (ListView)tabInnerView.findViewById(R.id.groupList);
		listViewAdapter = new PostingsListviewAdapter();
		groups.setAdapter(listViewAdapter);

		groupAddBtn = (FloatingActionButton)tabInnerView.findViewById(R.id.fab);
		groupAddBtn.setOnClickListener(v -> {
			Intent intent = new Intent(v.getContext(), StudyGroupWritingActivity.class);
			startActivity(intent);
		});

		return tabInnerView;
	}

}
