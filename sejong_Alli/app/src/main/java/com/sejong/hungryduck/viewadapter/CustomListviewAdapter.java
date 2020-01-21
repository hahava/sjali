package com.sejong.hungryduck.viewadapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.sejong.hungryduck.PostingsListView;
import com.sejong.hungryduck.model.CustomItem;
import com.sejong.hungryduck.model.ViewHolder;
import com.sejong.hungryduck.sejong.R;

import java.util.ArrayList;
import java.util.List;

public class CustomListviewAdapter extends BaseAdapter {

	private List<CustomItem> allMenuListData = new ArrayList<>();
	private ViewHolder viewHolder;

	@Override
	public int getCount() {
		return allMenuListData.size();
	}

	@Override
	public Object getItem(int position) {
		return allMenuListData.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public void addItem(Drawable thumbnailImage, String title, String regDate) {
		CustomItem item = new CustomItem();
		item.setThumbnailImage(thumbnailImage);
		item.setTitle(title);
		item.setRegDate(regDate);
		allMenuListData.add(item);
	}

	private void viewBindings(View view) {
		viewHolder.setThumbnailImageView((ImageView)view.findViewById(R.id.customImage));
		viewHolder.setTitleView((TextView)view.findViewById(R.id.customTitle));
		viewHolder.setRegDateView((TextView)view.findViewById(R.id.customDate));
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			viewHolder = new ViewHolder();
			LayoutInflater inflater = (LayoutInflater)parent.getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.custom_view, null);
			viewBindings(convertView);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder)convertView.getTag();
		}

		CustomItem selectedItem = allMenuListData.get(position);

		if (selectedItem.getThumbnailImage() != null) {
			viewHolder.getThumbnailImageView().setVisibility(View.VISIBLE);
			viewHolder.getThumbnailImageView().setImageDrawable(selectedItem.getThumbnailImage());
		} else {
			viewHolder.getThumbnailImageView().setVisibility(View.GONE);
		}
		viewHolder.getTitleView().setText(selectedItem.getTitle());
		viewHolder.getRegDateView().setText(selectedItem.getRegDate());

		convertView.setOnClickListener(v -> {
			Intent intent = new Intent(parent.getContext(), PostingsListView.class);
			intent.putExtra("itemNumber", position);
			parent.getContext().startActivity(intent);
		});

		return convertView;
	}
}
