package com.sejong.hungryduck.activity.fragment.Tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.sejong.hungryduck.apicall.PostingService;
import com.sejong.hungryduck.model.Posting;
import com.sejong.hungryduck.sejong.R;
import com.sejong.hungryduck.viewadapter.PostingsListviewAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class FirstView extends Fragment {
	private View view;
	private ListView menuList;
	private PostingsListviewAdapter listViewAdapter;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		if (view == null) {
			view = inflater.inflate(R.layout.out_side, null);
		}

		getPostings();
		return view;
	}

	private void getPostings() {

		Retrofit retrofit = new Retrofit.Builder()
			.baseUrl(getString(R.string.dev_addr))
			.addConverterFactory(GsonConverterFactory.create())
			.build();

		Call<List<Posting>> result = retrofit.create(PostingService.class)
			.getPostings(0, 4);

		result.enqueue(new Callback<List<Posting>>() {
			@Override public void onResponse(Call<List<Posting>> call, Response<List<Posting>> response) {
				List<Posting> postings = response.body();
				setListView(postings);
			}

			@Override public void onFailure(Call<List<Posting>> call, Throwable t) {
			}
		});
	}

	private void setListView(List<Posting> postings) {
		menuList = (ListView)view.findViewById(R.id.outList);
		listViewAdapter = new PostingsListviewAdapter();
		menuList.setAdapter(listViewAdapter);
		for (Posting posting : postings) {
			listViewAdapter.addItem(posting);
		}
	}
}
