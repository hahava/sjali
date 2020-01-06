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
	private View tabInnerView;
	private ListView items;
	private CustomListviewAdapter itemListViewApdapter;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		if (tabInnerView == null) {
			tabInnerView = inflater.inflate(R.layout.in_side, null);
		}

		//Example
		items = (ListView)tabInnerView.findViewById(R.id.inList);
		itemListViewApdapter = new CustomListviewAdapter(getActivity());
		items.setAdapter(itemListViewApdapter);

		itemListViewApdapter.addItem(getResources().getDrawable(R.drawable.out_one, null),
			"스토리, 세대를 잇다!",
			"~ 2016_12_30");

		return tabInnerView;
	}
}
