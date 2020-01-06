package com.example.eeww9.sejong_alli.fragment.Tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.example.eeww9.sejong_alli.CustomListviewAdapter;
import com.example.eeww9.sejong_alli.R;

public class SecondView extends Fragment {
	private View tabInnerView;
	private ListView items;
	private CustomListviewAdapter itemListViewAdapter;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		if (tabInnerView == null) {
			tabInnerView = inflater.inflate(R.layout.in_side, null);
		}

		setItemListView();
		return tabInnerView;
	}

	private void setItemListView() {
		items = (ListView)tabInnerView.findViewById(R.id.inList);
		itemListViewAdapter = new CustomListviewAdapter(getActivity());
		items.setAdapter(itemListViewAdapter);

		itemListViewAdapter.addItem(getResources().getDrawable(R.drawable.out_one, null),
			"스토리, 세대를 잇다!",
			"~ 2016_12_30");
	}
}
