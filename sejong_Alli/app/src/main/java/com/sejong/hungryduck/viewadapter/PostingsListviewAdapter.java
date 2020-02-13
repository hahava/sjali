package com.sejong.hungryduck.viewadapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.sejong.hungryduck.activity.PostingView;
import com.sejong.hungryduck.model.CustomItem;
import com.sejong.hungryduck.model.ViewHolder;
import com.sejong.hungryduck.sejong.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PostingsListviewAdapter extends BaseAdapter {

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

	public void addItem(String thumbnailImage, String title, String regDate) {
		CustomItem item = new CustomItem();
		item.setThumbnailImage(thumbnailImage);
		item.setTitle(title);
		item.setRegDate(regDate);
		allMenuListData.add(item);
	}

	private void viewBindings(View view, CustomItem selectedItem) {
		Picasso.get()
			.load(view.getContext().getString(R.string.dev_addr) + "/image/" + selectedItem.getThumbnailImage())
			.into((ImageView)view.findViewById(R.id.customImage));
		viewHolder.setThumbnailImageView((ImageView)view.findViewById(R.id.customImage));
		viewHolder.setTitleView((TextView)view.findViewById(R.id.customTitle));
		viewHolder.setRegDateView((TextView)view.findViewById(R.id.customDate));
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		CustomItem selectedItem = allMenuListData.get(position);

		if (convertView == null) {
			viewHolder = new ViewHolder();
			LayoutInflater inflater = (LayoutInflater)parent.getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.custom_view, null);
			viewBindings(convertView, selectedItem);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder)convertView.getTag();
		}

		if (selectedItem.getThumbnailImage() != null) {
			viewHolder.getThumbnailImageView().setVisibility(View.VISIBLE);
		} else {
			viewHolder.getThumbnailImageView().setVisibility(View.GONE);
		}
		viewHolder.getTitleView().setText(selectedItem.getTitle());
		viewHolder.getRegDateView().setText(selectedItem.getRegDate());

		convertView.setOnClickListener(v -> {
			Intent intent = new Intent(parent.getContext(), PostingView.class);
			intent.putExtra("itemNumber", position);
			parent.getContext().startActivity(intent);
		});

		return convertView;
	}
}
