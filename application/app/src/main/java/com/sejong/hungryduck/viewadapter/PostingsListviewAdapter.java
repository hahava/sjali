package com.sejong.hungryduck.viewadapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.sejong.hungryduck.activity.PostingActivity;
import com.sejong.hungryduck.model.Posting;
import com.sejong.hungryduck.model.ViewHolder;
import com.sejong.hungryduck.sejong.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PostingsListviewAdapter extends BaseAdapter {

	private List<Posting> items = new ArrayList<>();
	private ViewHolder viewHolder;

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Object getItem(int position) {
		return items.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public void addItem(Posting posting) {
		items.add(posting);
	}

	private void viewBindings(View view, Posting selectedPosting) {
		Picasso.get()
			.load(view.getContext().getString(R.string.dev_addr) + "/image/" + selectedPosting.getImgPath())
			.error(R.drawable.board_item_basic_thumbnail)
			.into((ImageView)view.findViewById(R.id.customImage));

		viewHolder.setThumbnailImageView((ImageView)view.findViewById(R.id.customImage));
		viewHolder.setTitleView((TextView)view.findViewById(R.id.customTitle));
		viewHolder.setRegDateView((TextView)view.findViewById(R.id.customDate));
		viewHolder.setHostView((TextView)view.findViewById(R.id.host));

		viewHolder.getTitleView().setText(selectedPosting.getMainTitle());
		viewHolder.getRegDateView().setText(selectedPosting.getEndDate());
		viewHolder.getHostView().setText(selectedPosting.getHost());
	}

	@Override
	public View getView(final int position, View postingListView, ViewGroup parent) {
		Posting selectedPosting = items.get(position);

		if (postingListView == null) {
			viewHolder = new ViewHolder();
			LayoutInflater inflater = (LayoutInflater)parent.getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			postingListView = inflater.inflate(R.layout.item_posting, null);
			viewBindings(postingListView, selectedPosting);
			postingListView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder)postingListView.getTag();
		}

		postingListView.setOnClickListener(v -> {
			Intent intent = new Intent(parent.getContext(), PostingActivity.class);
			intent.putExtra("itemNumber", position);
			parent.getContext().startActivity(intent);
		});

		return postingListView;
	}
}
